package ph.com.montrichard.bisaya.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class BisayaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(BisayaConfigApplication.class, args);
	}
}
