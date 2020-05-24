package spring;

import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class cricket {
	 @RequestMapping("/")
	    String home() {
	        return "Welcome to NFT Sterlite....";
	    }
}
