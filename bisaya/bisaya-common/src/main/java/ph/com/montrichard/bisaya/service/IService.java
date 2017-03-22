/**
 * 
 */
package ph.com.montrichard.bisaya.service;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import org.springframework.data.domain.Page;

/**
 * Mar 21, 2017 3:10:44 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public interface IService<T, ID> {
	
	public T create(@NotNull T type);
	
	public Page<T> read(Integer offSet, Integer limit);
	
	public Collection<T> read();
	
	public T read(@NotNull ID id);
	
	public T update(@NotNull T type);
	
	public void delete(@NotNull ID id);
	
}
