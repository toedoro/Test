/**
 * 
 */
package ph.com.montrichard.bisaya.order.service;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Date;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import ph.com.montrichard.bisaya.order.entity.Order;
import ph.com.montrichard.bisaya.order.repository.IOrderRepository;
import ph.com.montrichard.bisaya.repository.IRepository;
import ph.com.montrichard.bisaya.service.AbstractService;

/**
 * Mar 18, 2017 10:06:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Service
public class OrderService extends AbstractService<Order, BigInteger> implements IOrderService{
	
	@Inject
	private IOrderRepository orderRepository;
	
	/* (non-Javadoc)
	 * @see ph.com.montrichard.bisaya.service.AbstractService#getRepository()
	 */
	@Override
	protected IRepository<Order, BigInteger> getRepository() {
		return orderRepository;
	}
	
	@Override
	public Order create( Order order ){
		Long size = orderRepository.count();
		String orderNo = String.format("ORDER000%s", size+1);
		order.setCreatedBy("ADMIN");
		order.setOrderNo(orderNo);
		order.setStatus("Waiting For Confirmation");
		super.create(order);
		
		return order;
	}

	/* (non-Javadoc)
	 * @see ph.com.montrichard.bisaya.order.service.IOrderService#updateOrderStatus(java.lang.String, java.math.BigInteger)
	 */
	@Override
	public Order updateOrderStatus(BigInteger id, String status) {
		Order order = new Order();
		order.setId(id);
		order.setStatus(status);
		super.update(order);
//		orderRepository.updateOrderStatus(status, id);
		
		return order;
	}

	@Override
	public Order findByOrderNo(String orderNo) {
		return orderRepository.findByOrderNo(orderNo);
	}
	
	@Override
	public Collection<Order> findByProductionStartDate(Long productionStartDate) {
		
		return orderRepository.findByProductionStartDate(new Date(productionStartDate));
	}
	
	
	
	
}
