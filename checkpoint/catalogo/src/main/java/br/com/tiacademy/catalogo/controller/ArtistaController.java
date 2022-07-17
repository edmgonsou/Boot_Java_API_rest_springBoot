package br.com.tiacademy.catalogo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artista")

public class ArtistaController {
	
	@GetMapping
	public String nomeArtista() {
		return "Henrique";
	}
}
