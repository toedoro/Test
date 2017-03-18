/**
 * 
 */
package ph.com.montrichard.bisaya.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import ph.com.montrichard.bisaya.repository.IRepository;

/**
 * Nov 15, 2016 10:08:06 AM
 * @version 1.0
 * @author © tdelacerna <teodoro.delacerna@fsoft.com.vn>
 */
@Validated
@Transactional
public abstract class AbstractService<T, ID extends Serializable> implements IService<T, ID>{

	protected abstract IRepository<T, ID> getRepository();
	
	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#create(java.util.Collection)
	 */
	@Override
	public Collection<T> create(@NotNull Collection<T> types) {
		try{
			
			return getRepository().save(types);
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#create(java.lang.Object)
	 */
	@Override
	public T create(@NotNull T type) {
		try{
			
			return getRepository().save(type);
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#read()
	 */
	@Override
	public Collection<T> read() {
		return getRepository().findAll();
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#read(java.lang.Integer, java.lang.Integer)
	 */
	@Override
	public Page<T> read(Integer offSet, Integer limit) {
		return getRepository().findAll( pageable(offSet, limit) );
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#read(java.lang.Object)
	 */
	@Override
	public T read(@NotNull ID id) {
		return getRepository().findOne(id);
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#update(java.util.Collection)
	 */
	@Override
	public Collection<T> update(@NotNull Collection<T> types) {
		try{
			return getRepository().save(types);
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}

	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#update(java.lang.Object)
	 */
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
	
	
	/* (non-Javadoc)
	 * @see ph.com.fsoft.bisdak.playlist.service.IService#delete(java.lang.Object)
	 */
	@Override
	public void delete(@NotNull Collection<T> types) {
		try{
			getRepository().delete( types );
		}catch(Exception ex){
			throw new IllegalStateException(ex.getMessage(), ex);
		}
	}
	
	protected Pageable pageable(Integer offSet, Integer limit ){
		Sort sort = new Sort(new Order(Direction.DESC, "createdDate"));
		return new PageRequest( offSet, limit, sort );
	}
	
	protected Specification<T> specification( Map<String, String> specifications ){
		return new Specification<T>() {
			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				specifications
					.entrySet().stream().map( (entry) -> {
						String like = String.format("%s%s%s", "%", entry.getValue().toLowerCase(), "%");
						return cb.like(cb.lower(root.get( entry.getKey() )), like);
					});
				
				return cb.conjunction();
				
			}
		};
	}
}
