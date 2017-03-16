/**
 * 
 */
package ph.com.montrichard.bisaya.production.endpoint.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Mar 16, 2017 6:05:53 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@RefreshScope
@RestController
public class ProductionRestEndpoint {
	
	@Value("${message:Hello default}")
    private String message;

	@GetMapping("/message")
    public String getMessage() {
        return this.message;
    }
	
}
