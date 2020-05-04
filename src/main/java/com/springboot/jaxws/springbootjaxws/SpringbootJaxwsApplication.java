package com.springboot.jaxws.springbootjaxws;

import com.springboot.jaxws.springbootjaxws.service.UnWebService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class SpringbootJaxwsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJaxwsApplication.class, args);

		Endpoint
				.publish("http://localhost:8080/UnWebService", new UnWebService());
	}


}
