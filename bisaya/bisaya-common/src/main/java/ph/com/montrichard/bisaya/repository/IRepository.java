/**
 * 
 */
package ph.com.montrichard.bisaya.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Nov 15, 2016 9:55:32 AM
 * @version 1.0
 * @author © tdelacerna <teodoro.delacerna@fsoft.com.vn>
 */
@NoRepositoryBean
public interface IRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

}