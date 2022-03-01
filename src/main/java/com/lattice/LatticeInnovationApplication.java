package com.lattice;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
//@EnableSwagger2
public class LatticeInnovationApplication {

//	private static final Logger logger = LoggerFactory.getLogger(LatticeInnovationApplication.class);
	public static void main(String[] args) {
		
		SpringApplication.run(LatticeInnovationApplication.class, args);
//	      logger.debug("Debug Message Logged !!!");
//	      logger.info("Info Message Logged !!!");
//	      logger.error("Error Message Logged !!!");
		
	}

}
