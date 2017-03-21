/**
 * 
 */
package ph.com.montrichard.bisaya.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Mar 21, 2017 3:09:52 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@NoRepositoryBean
public interface IRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

}
