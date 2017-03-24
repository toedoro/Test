/**
 * 
 */
package ph.com.montrichard.bisaya.production.endpoint.rest;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ph.com.montrichard.bisaya.dto.OrderDto;
import ph.com.montrichard.bisaya.production.entity.Production;
import ph.com.montrichard.bisaya.production.service.ProductionService;

/**
 * Mar 16, 2017 6:05:53 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
@CrossOrigin(origins = "*") // "127.0.0.0:8888"
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class ProductionRestEndpoint {
	
	@Inject
	private ProductionService productionService;
	
	@GetMapping
	public Collection<Production> read(){
		
		return productionService.read();
	}
	
	@GetMapping("/orders")
	public Collection<OrderDto> getOrders(){
		
		return productionService.getOrders();
	}
	
	
	
}
