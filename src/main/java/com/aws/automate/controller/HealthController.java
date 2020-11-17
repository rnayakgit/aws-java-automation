package com.aws.automate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
	
@RequestMapping(value="/status" , method = RequestMethod.GET)
public ResponseEntity<String>getHealthStatus(){
	
return  ResponseEntity.ok("{ status:ok }");	
	
}

}
