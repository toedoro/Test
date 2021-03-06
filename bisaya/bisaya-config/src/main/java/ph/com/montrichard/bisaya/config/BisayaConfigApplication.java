package ph.com.montrichard.bisaya.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Mar 16, 2017 2:10:22 PM
 * @version 1.0
 * @author © tdelacerna <delacerna_teodoro@yahoo.com>
 */
@EnableConfigServer
@SpringBootApplication
public class BisayaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BisayaConfigApplication.class, args);
	}
}
