package au.gov.myhr.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;
//import zipkin.server.EnableZipkinServer;
import java.util.logging.Logger;


@SpringBootApplication
@EnableZipkinStreamServer
//@EnableZipkinServer
public class Application {

	protected Logger logger = Logger.getLogger(Application.class.getName());
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
