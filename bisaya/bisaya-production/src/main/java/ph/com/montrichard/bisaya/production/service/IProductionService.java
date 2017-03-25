/**
 * 
 */
package ph.com.montrichard.bisaya.production.service;

import java.math.BigInteger;
import java.util.Collection;

import ph.com.montrichard.bisaya.dto.OrderDto;
import ph.com.montrichard.bisaya.production.entity.Production;
import ph.com.montrichard.bisaya.service.IService;

/**
 * Mar 24, 2017 1:25:47 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
public interface IProductionService extends IService<Production, BigInteger>{
	
	public Collection<OrderDto> getOrders();
	
	public OrderDto getOrderByNo(String orderNo);
	
	public Collection<OrderDto> getOrderByProductionStartDate( Long productionStartDate );
	
	public OrderDto update( OrderDto order );
}
