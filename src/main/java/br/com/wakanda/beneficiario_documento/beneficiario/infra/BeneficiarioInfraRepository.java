package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import br.com.wakanda.beneficiario_documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

	private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

	@Override
	public Beneficiario salva(Beneficiario beneficiario) {
		log.info("[inicia] BeneficiarioInfraRepository - salva");
		beneficiarioSpringDataJPARepository.save(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository - salva");
		return beneficiario;
	}

	@Override
	public List<Beneficiario> buscaTodosBeneficiarios() {
		log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
		List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
		log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
		return todosBeneficiarios;
	}

	@Override
	public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
		Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiário não encontrado!"));
		log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
		return beneficiario;
	}
}