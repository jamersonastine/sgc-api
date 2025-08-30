package br.com.sgc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastros")
public class CadastroController {

	
		@GetMapping
		public ResponseEntity<String> FindAll()  {
			return ResponseEntity.ok("Olá Wesley!");
			

		}
}
