package br.com.wakanda.beneficiario_documento.beneficiario.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
	private UUID idBeneficiario;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	private String telefone;
	@NotNull
	private LocalDate dataNascimento;
	
	private LocalDateTime dataInclusao;
	private LocalDateTime dataAtualizacao;

	public Beneficiario(BeneficiarioRequest beneficiarioRequest) {
		this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
		this.telefone = beneficiarioRequest.getTelefone();
		this.dataNascimento = beneficiarioRequest.getDataNascimento();
		this.dataInclusao = LocalDateTime.now();
	}

	public void altera(BeneficiarioAlteracaoRequest beneficiarioRequest) {
		this.nomeCompleto = beneficiarioRequest.getNomeCompleto();
		this.telefone = beneficiarioRequest.getTelefone();
		this.dataNascimento = beneficiarioRequest.getDataNascimento();
		this.dataAtualizacao = LocalDateTime.now();
	}
}