package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import java.util.List;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioAlteracaoRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioDetalhadoResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
	List<BeneficiarioListResponse> buscaTodosBeneficiarios();
	Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);
	void deletaBeneficiarioAtravesId(UUID idBeneficiario);
	void patchAlteraBeneficiario(UUID idBeneficiario, BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest);
}