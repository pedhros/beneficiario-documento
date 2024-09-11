package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class BeneficiarioListResponse {
	private UUID idBeneficiario;
	private String nomeCompleto;
	private String telefone;
	private LocalDate dataNascimento;
}
