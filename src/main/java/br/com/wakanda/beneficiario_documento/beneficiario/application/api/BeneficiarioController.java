package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.util.List;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import org.springframework.web.bind.annotation.RestController;

import br.com.wakanda.beneficiario_documento.beneficiario.application.service.BeneficiarioService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioController implements BeneficiarioAPI {
	private final BeneficiarioService beneficiarioService;

	@Override
	public BeneficiarioResponse postBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		log.info("[inicia] BeneficiarioController - postBeneficiario");
		BeneficiarioResponse beneficiarioCriado = beneficiarioService.criaBeneficiario(beneficiarioRequest);
		log.info("[finaliza] BeneficiarioController - postBeneficiario");
		return beneficiarioCriado;
	}

	@Override
	public List<BeneficiarioListResponse> getTodosBeneficiarios() {
		log.info("[inicia] BeneficiarioController - getTodosBeneficiario");
		List<BeneficiarioListResponse> beneficiarios = beneficiarioService.buscaTodosBeneficiarios();
		log.info("[finaliza] BeneficiarioController - getTodosBeneficiario");
		return beneficiarios;
	}

	@Override
	public BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[inicia] BeneficiarioController - getBeneficiarioAtravesId");
		log.info("[idBeneficiario] {}",idBeneficiario);
		Beneficiario beneficiario = beneficiarioService.buscaBeneficiarioAtravesId(idBeneficiario);
		log.info("[finaliza] BeneficiarioController - getBeneficiarioAtravesId");
		return new BeneficiarioDetalhadoResponse(beneficiario);
	}

	@Override
	public void deletaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[inicia] BeneficiarioController - deletaBeneficiarioAtravesId");
		log.info("[idBeneficiario] {}",idBeneficiario);
		beneficiarioService.deletaBeneficiarioAtravesId(idBeneficiario);
		log.info("[finaliza] BeneficiarioController - deletaBeneficiarioAtravesId");
	}

	@Override
	public void patchAlteraBeneficiario(UUID idBeneficiario, @Valid BeneficiarioAlteracaoRequest beneficiarioAlteracaoRequest) {
		log.info("[inicia] BeneficiarioController - beneficiarioAlteracaoRequest");
		log.info("[idBeneficiario] {}",idBeneficiario);
		beneficiarioService.patchAlteraBeneficiario(idBeneficiario, beneficiarioAlteracaoRequest);
		log.info("[finaliza] BeneficiarioController - beneficiarioAlteracaoRequest");
	}
}