package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
public class HelloWorldController {
	
	@Value("${sampleMessage}")
	public String sampleMessage;
	
	@RequestMapping(value="/getMessage", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> getMessage(){
		return new ResponseEntity<String>( sampleMessage, HttpStatus.OK);
	}

}
