package ph.com.montrichard.bisaya.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Mar 16, 2017 3:49:36 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@EnableEurekaServer
@SpringBootApplication
public class BisayaRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BisayaRegistryApplication.class, args);
	}
}
