package br.com.wakanda.beneficiario_documento.beneficiario.application.repository;

import java.util.List;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
	Beneficiario salva(Beneficiario beneficiario);
	List<Beneficiario> buscaTodosBeneficiarios();
}