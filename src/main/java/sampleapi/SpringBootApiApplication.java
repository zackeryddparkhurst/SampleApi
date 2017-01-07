package sampleapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiApplication.class, args);
	}

	@RestController
	public class SimpleController {

        @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
        public String sayHello(@PathVariable String name) {
            System.out.println(name + " just said hello");
            return "Hello " + name + " great day we are having today";
        }
    }
}
