/**
 * 
 */
package ph.com.montrichard.bisaya.production.service;

import java.math.BigInteger;
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import ph.com.montrichard.bisaya.dto.OrderDto;
import ph.com.montrichard.bisaya.production.entity.Production;
import ph.com.montrichard.bisaya.production.repository.IProductionRepository;
import ph.com.montrichard.bisaya.repository.IRepository;
import ph.com.montrichard.bisaya.service.AbstractService;
import ph.com.montrichard.bisaya.util.Constants;

/**
 * Mar 19, 2017 10:23:08 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Service
public class ProductionService extends AbstractService<Production, BigInteger> implements IProductionService{
	
	@Inject
	private IProductionRepository productionRepository;
	
	@Inject
	RestOperations restTemplate;
	
	/* (non-Javadoc)
	 * @see ph.com.montrichard.bisaya.service.AbstractService#getRepository()
	 */
	@Override
	protected IRepository<Production, BigInteger> getRepository() {
		return productionRepository;
	}
	
	public Collection<OrderDto> getOrders(){
		String url = String.format("http://%s/order/api", Constants.ORDER_SERVICE);
		Collection<OrderDto> orders = restTemplate.getForObject(url, Collection.class);
		
		return orders;
	}
	
	public OrderDto update( OrderDto order ){
		String url = String.format("http://%s/order/api", Constants.ORDER_SERVICE);
		restTemplate.put(url, order);
		
		return order;
	}

}
