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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ph.com.montrichard.bisaya.order.entity.Product;
import ph.com.montrichard.bisaya.order.service.ProductService;

/**
 * Mar 19, 2017 9:56:45 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
@RequestMapping(path="product/api",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class ProductRestEndpoint {
	
	@Inject
	private ProductService productService;
	
	@PostMapping
	public Product create( @RequestBody Product product ){
		return productService.create(product);
	}
	
	@GetMapping
	public Collection<Product> read(){
		
		return productService.read();
	}

}
