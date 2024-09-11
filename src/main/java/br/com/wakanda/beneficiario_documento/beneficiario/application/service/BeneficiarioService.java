package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import java.util.List;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
	List<BeneficiarioListResponse> buscaTodosBeneficiarios();
}