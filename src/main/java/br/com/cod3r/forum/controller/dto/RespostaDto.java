package br.com.cod3r.forum.controller.dto;

import java.time.LocalDateTime;

import br.com.cod3r.forum.modelo.Resposta;
import lombok.Getter;

@Getter
public class RespostaDto {
	
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	
	public RespostaDto(Resposta resposta) {
		this.id = resposta.getId();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}
}
