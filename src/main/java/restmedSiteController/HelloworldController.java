package restmedSiteController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController Combination of @Controler and @ResposeBody

@RestController
public class HelloworldController {
	
	
	@GetMapping("/hello-world")
	@RequestMapping()
	public String helloWorld() {
		
		return "Hello-World Mr. Anil Kumar";
	}
	
	
	

	
}
