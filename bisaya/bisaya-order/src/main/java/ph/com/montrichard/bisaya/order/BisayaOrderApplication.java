package ph.com.montrichard.bisaya.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * Mar 16, 2017 1:33:10 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BisayaOrderApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(BisayaOrderApplication.class, args);
	}
}
