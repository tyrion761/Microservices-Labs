package demo.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OtherController {

	@Autowired
	RestTemplate  restTemplate;
	
	
	@GetMapping
	public String getMsg()
	{
		String msg = restTemplate.getForObject("http://SimpleService", String.class);
		return "Unshakbale"+msg;
	}
}
