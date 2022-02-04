package br.com.cod3r.forum.config.validation;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class ErroDeFormularioDto {
	
	private String campo;
	private String erro;
	
}
