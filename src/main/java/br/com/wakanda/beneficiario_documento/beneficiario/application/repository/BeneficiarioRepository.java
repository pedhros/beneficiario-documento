package br.com.wakanda.beneficiario_documento.beneficiario.application.repository;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public interface BeneficiarioRepository {
	Beneficiario salva(Beneficiario beneficiario);
}