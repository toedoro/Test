/**
 * 
 */
package ph.com.montrichard.bisaya.order.endpoint.rest;

import java.math.BigInteger;
import java.util.Collection;

import javax.inject.Inject;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.montrichard.bisaya.order.entity.Order;
import ph.com.montrichard.bisaya.order.service.OrderService;

/**
 * Mar 16, 2017 5:49:21 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class OrderRestEndpoint {
	
	@Inject
	private OrderService orderService;
	
	@PostMapping
	public Order create( @RequestBody Order order ){
		return orderService.create(order);
	}
	
	@GetMapping
	public Collection<Order> read(){

		return orderService.read();
	}
	
	@PutMapping
	public Order update( @RequestBody Order order ){
		return orderService.update(order);
	}
	
	@PutMapping("/id/{id}/status/{status}")
	public Order updateStatus( @PathVariable BigInteger id, @PathVariable String status ){
		return orderService.updateOrderStatus(id, status);
	}
	
}
