package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public class BeneficiarioListResponse {
	private UUID idBeneficiario;
	private String nomeCompleto;
	private String telefone;
	private LocalDate dataNascimento;
	
	public static List<BeneficiarioListResponse> converte(List<Beneficiario> beneficiarios) {
		return null;
	}
}
