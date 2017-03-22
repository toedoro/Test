/**
 * 
 */
package ph.com.montrichard.bisaya.service;

import java.io.Serializable;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import ph.com.montrichard.bisaya.repository.IRepository;

/**
 * Mar 21, 2017 3:10:30 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Validated
@Transactional
public abstract class AbstractService<T, ID extends Serializable> implements IService<T, ID>{

	protected abstract IRepository<T, ID> getRepository();
	
	@Override
	public T create(@NotNull T type) {
		try{
			
			return getRepository().save(type);
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}
	
	@Override
	public Collection<T> read() {
		return getRepository().findAll();
	}
	
	@Override
	public Page<T> read(Integer offSet, Integer limit) {
		return getRepository().findAll( pageable(offSet, limit) );
	}

	@Override
	public T read(@NotNull ID id) {
		return getRepository().findOne(id);
	}

	@Override
	public T update(@NotNull T type) {
		try{
			return getRepository().save(type);
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(@NotNull ID id) {
		try{
			getRepository().delete( id );
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}
	
	protected Pageable pageable(Integer offSet, Integer limit ){
		Sort sort = new Sort(new Order(Direction.DESC, "createdDate"));
		return new PageRequest( offSet, limit, sort );
	}
	
}
