package primeiroTeste.primeiroTeste.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entidades.Topic;

@RestController
public class Topics {
	@PostMapping(value = "/topics", consumes = "application/json", produces ="application/json")
	
	
	public ResponseEntity<String> getAllTopics(@RequestBody Topic body) {
		System.out.println(body.getNome());
		
		return ResponseEntity.ok("Funcionou");
	}
}
