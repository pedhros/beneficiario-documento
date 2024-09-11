package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import org.springframework.stereotype.Repository;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
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
}