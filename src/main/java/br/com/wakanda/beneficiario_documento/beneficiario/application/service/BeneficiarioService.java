package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;

public interface BeneficiarioService {
	BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest);
}