package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.Value;

@Value
public class BeneficiarioListResponse {
	private UUID idBeneficiario;
	private String nomeCompleto;
	private String telefone;
	private LocalDate dataNascimento;
	
	public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
		return beneficiarios.stream()
				.map(BeneficiarioListResponse::new)
				.collect(Collectors.toList());
	}

	public BeneficiarioListResponse(Beneficiario beneficiario) {
		this.idBeneficiario = beneficiario.getIdBeneficiario();
		this.nomeCompleto = beneficiario.getNomeCompleto();
		this.telefone = beneficiario.getTelefone();
		this.dataNascimento = beneficiario.getDataNascimento();
	}	
}