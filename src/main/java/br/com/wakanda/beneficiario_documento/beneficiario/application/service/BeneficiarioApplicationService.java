package br.com.wakanda.beneficiario_documento.beneficiario.application.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioRequest;
import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioResponse;
import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioApplicationService implements BeneficiarioService {
	private final BeneficiarioRepository beneficiarioRepository;

	@Override
	public BeneficiarioResponse criaBeneficiario(BeneficiarioRequest beneficiarioRequest) {
		log.info("[inicia] BeneficiarioApplicationService - criaBeneficiario");
		Beneficiario beneficiario = beneficiarioRepository.salva(new Beneficiario(beneficiarioRequest));
		log.info("[finaliza] BeneficiarioApplicationService - criaBeneficiario");
		return BeneficiarioResponse.builder()
				.idBeneficiario(beneficiario.getIdBeneficiario())
				.build();
	}

	@Override
	public List<BeneficiarioListResponse> buscaTodosBeneficiarios() {
		log.info("[inicia] BeneficiarioApplicationService - buscaTodosBeneficiarios");
		List<Beneficiario> beneficiarios = beneficiarioRepository.buscaTodosBeneficiarios();
		log.info("[finaliza] BeneficiarioApplicationService - buscaTodosBeneficiarios");
		return BeneficiarioListResponse.converte(beneficiarios);
	}
}