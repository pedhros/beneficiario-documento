package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;

public interface BeneficiarioSpringDataJPA extends JpaRepository<Beneficiario, UUID> {

}