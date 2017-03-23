/**
 * 
 */
package ph.com.montrichard.bisaya.order.service;

import java.math.BigInteger;

import ph.com.montrichard.bisaya.order.entity.Orders;
import ph.com.montrichard.bisaya.service.IService;

/**
 * Mar 18, 2017 10:05:51 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */

public interface IOrderService extends IService<Orders, BigInteger>{
	
	Orders updateOrderStatus(BigInteger id, String status);
	
}
