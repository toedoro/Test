package ph.com.montrichard.bisaya.production;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * Mar 16, 2017 5:18:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BisayaProductionApplication {
	
	@Bean
	@Primary
	@LoadBalanced
	public RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BisayaProductionApplication.class, args);
	}
}
