package demo.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@GetMapping
	public String getMsg()
	{
		 System.out.println("Instance 1 ... invoked");
		return "Faith";
	}
}
