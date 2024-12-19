package br.com.wakanda.beneficiario_documento.beneficiario.application.repository;

import java.util.List;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
	Beneficiario salva(Beneficiario beneficiario);
	List<Beneficiario> buscaTodosBeneficiarios();
	Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario);
	void deletaBeneficiario(Beneficiario beneficiario);
}