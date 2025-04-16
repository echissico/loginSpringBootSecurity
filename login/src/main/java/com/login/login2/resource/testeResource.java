package com.login.login2.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teste")
public class testeResource {
	
	@GetMapping("{number}")
	public ResponseEntity<String> teste(@PathVariable("number") String number) throws Exception {
		if(number.equalsIgnoreCase("1")) {
			
			throw new Exception("Erro de teste teste 1");
		}
		return ResponseEntity.ok("ola mundo: "+number);
	}

}
