/**
 * 
 */
package ph.com.montrichard.bisaya.production.endpoint.rest;

import java.util.Collection;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ph.com.montrichard.bisaya.dto.OrderDto;
import ph.com.montrichard.bisaya.production.service.ProductionService;

/**
 * Mar 16, 2017 6:05:53 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
@RequestMapping(path="/api",produces = {MediaType.APPLICATION_JSON_UTF8_VALUE})
public class ProductionRestEndpoint {
	
	@Inject
	private ProductionService productionService;
	
	@GetMapping
	public Collection<OrderDto> read( @RequestParam Map<String, String> param ){
		Integer offSet = Integer.parseInt(param.get("pageNo"));
		Integer limit = Integer.parseInt(param.get("pageSize"));
		
		return productionService.read(offSet, limit);
	}
	
	
	
}
