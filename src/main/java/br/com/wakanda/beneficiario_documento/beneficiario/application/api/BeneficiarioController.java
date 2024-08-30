package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class BeneficiarioController implements BeneficiarioAPI {

	@Override
	public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		log.info("[inicia] BeneficiarioController - postBeneficiario");
		log.info("[finaliza] BeneficiarioController - postBeneficiario");
		return null;
	}
}