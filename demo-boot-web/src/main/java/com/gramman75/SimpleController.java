package com.gramman75;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;


@RestController
@Slf4j
public class SimpleController {
	
	@GetMapping("/hello")
	public String hello(@RequestParam("id") Person person) {
		log.debug("grammanLog");
		return "hello " + person.getName();
	}
}



//@GetMapping("/hello/{name}")
//public String hello(@PathVariable("name") Person person) {
//	return "hello " + person.getName();
//}