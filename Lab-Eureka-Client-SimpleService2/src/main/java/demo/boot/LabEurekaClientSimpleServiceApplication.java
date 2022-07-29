package demo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class LabEurekaClientSimpleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabEurekaClientSimpleServiceApplication.class, args);
	}

}
