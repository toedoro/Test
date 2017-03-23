/**
 * 
 */
package ph.com.montrichard.bisaya.order.repository;

import java.math.BigInteger;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ph.com.montrichard.bisaya.order.entity.Orders;
import ph.com.montrichard.bisaya.repository.IRepository;

/**
 * Mar 21, 2017 6:22:43 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Repository
public interface IOrderRepository extends IRepository<Orders, BigInteger>{
	
//	@Modifying
//	@Transactional
//	@Query("UPDATE orders SET status = ?1 WHERE id = ?2")
	int updateOrderStatus( String status, BigInteger id );
	
}
