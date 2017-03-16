package ph.com.montrichard.bisaya.production;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Mar 16, 2017 5:18:11 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@SpringBootApplication
@EnableDiscoveryClient
public class BisayaProductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(BisayaProductionApplication.class, args);
	}
}
