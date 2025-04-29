package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface DocumentoSpringDataJPARepository extends JpaRepository <Documento, UUID> {

    List<Documento> findByIdBeneficiario(UUID idBeneficiario);
}
