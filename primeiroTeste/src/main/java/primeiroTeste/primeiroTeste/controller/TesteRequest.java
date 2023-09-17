package primeiroTeste.primeiroTeste.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteRequest {

	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/oi")
	public String request() {
		return "oi";
	}
	
	
}
