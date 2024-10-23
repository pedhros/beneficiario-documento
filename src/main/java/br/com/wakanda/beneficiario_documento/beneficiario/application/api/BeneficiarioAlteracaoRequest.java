package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class BeneficiarioAlteracaoRequest {
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String telefone;
	@NotNull
	private LocalDate dataNascimento;
}
