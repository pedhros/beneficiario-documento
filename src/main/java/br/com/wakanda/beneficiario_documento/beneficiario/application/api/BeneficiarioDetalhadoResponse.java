package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Value;

@Value
public class BeneficiarioDetalhadoResponse {
	private UUID idBeneficiario;
	private String nomeCompleto;
	private String telefone;
	private LocalDate dataNascimento;
	
	private LocalDateTime dataInclusao;
}