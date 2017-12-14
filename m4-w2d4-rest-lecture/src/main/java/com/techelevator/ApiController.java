package com.techelevator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {

	@RequestMapping(path="/api/getHello", method=RequestMethod.GET)
    public String getHello(@RequestParam String name) {
        return "Hello There " + name;
    }
	
}
