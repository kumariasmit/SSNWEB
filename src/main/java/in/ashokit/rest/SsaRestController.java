package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SsaRestController {
	
	@GetMapping("/ssn/{ssn}")
	private String getStateName(@PathVariable String ssn) {
		
		if(ssn.startsWith("6"))
			return "New Jersy";
		
		else if(ssn.startsWith("5")) {
			return "rhedo Island";
		}
		else if(ssn.startsWith("5")) {
			return "ohiyo";
		}
		else if(ssn.startsWith("5")) {
			return "caliphoriya";
		}
		
		else {
			return "invalid";
		}
		
	}
	

}
