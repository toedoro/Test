/**
 * 
 */
package ph.com.montrichard.bisaya.order.endpoint.rest;

import java.util.Collection;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ph.com.montrichard.bisaya.order.entity.Orders;
import ph.com.montrichard.bisaya.order.service.OrderService;

/**
 * Mar 16, 2017 5:49:21 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class OrderRestEndpoint {
	
	@Inject
	private OrderService orderService;
	
	@PostMapping
	public Orders create( @RequestBody Orders order ){
		return orderService.create(order);
	}
	
	@GetMapping
	public Collection<Orders> read( @RequestParam Map<String,String> param ){
		Integer offSet = Integer.parseInt(param.get("pageNo"));
		Integer limit = Integer.parseInt(param.get("pageSize"));
		
		return orderService.read(offSet, limit);
	}
	
	@PutMapping
	public Orders update( @RequestBody Orders order ){
		return orderService.update(order);
	}
	
}
