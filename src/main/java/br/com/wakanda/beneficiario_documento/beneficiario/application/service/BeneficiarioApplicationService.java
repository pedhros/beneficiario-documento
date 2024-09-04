package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import org.springframework.stereotype.Service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class BeneficiarioApplicationService implements BeneficiarioService {

	@Override
	public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
		log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
		return null;
	}

}
