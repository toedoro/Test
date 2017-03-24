/**
 * 
 */
package ph.com.montrichard.bisaya.order.service;

import java.math.BigInteger;

import ph.com.montrichard.bisaya.order.entity.Order;
import ph.com.montrichard.bisaya.service.IService;

/**
 * Mar 18, 2017 10:05:51 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */

public interface IOrderService extends IService<Order, BigInteger>{
	
	Order updateOrderStatus(BigInteger id, String status);
	
	Order findByOrderNo(String orderNo );
	
}
