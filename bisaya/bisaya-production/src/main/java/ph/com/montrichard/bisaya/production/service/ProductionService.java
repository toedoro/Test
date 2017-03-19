/**
 * 
 */
package ph.com.montrichard.bisaya.production.service;

import java.util.Collection;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

import ph.com.montrichard.bisaya.dto.OrderDto;
import ph.com.montrichard.bisaya.util.Constants;

/**
 * Mar 19, 2017 10:23:08 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@Service
public class ProductionService {
	
	@Inject
	RestOperations restTemplate;
	
	public Collection<OrderDto> read(Integer offSet, Integer limit){
		String uri = String.format("http://%s/order/api", Constants.ORDER_SERVICE);
		String url = String.format("%s?pageNo=%d&pageSize=%d", uri, offSet, limit);
		Collection<OrderDto> orders = restTemplate.getForObject(url, List.class);
		
		return orders;
	}
	
	public OrderDto update( OrderDto order ){
		String url = String.format("http://%s/order/api", Constants.ORDER_SERVICE);
		restTemplate.put(url, order);
		
		return order;
	}
}
