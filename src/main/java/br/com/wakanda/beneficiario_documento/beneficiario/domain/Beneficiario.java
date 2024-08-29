package br.com.wakanda.beneficiario_documento.beneficiario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Beneficiario {
	@Id
	private UUID idBeneficiario;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String telefone;
	@NotNull
	private LocalDate dataNascimento;
	
	private LocalDateTime dataInclusao;
	private LocalDateTime dataAtualizacao;
	
	public Beneficiario(@NotBlank String nomeCompleto, @NotBlank String telefone, @NotNull LocalDate dataNascimento) {
		this.idBeneficiario = UUID.randomUUID();
		this.nomeCompleto = nomeCompleto;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
		this.dataInclusao = LocalDateTime.now();
	}
}