package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Log4j2
@Repository
@RequiredArgsConstructor
public class DocumentoInfraRepository implements DocumentoRepository {
    private final DocumentoSpringDataJPARepository documentoSpringDataJPARepository;

    @Override
    public Documento salva(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salva");
        documentoSpringDataJPARepository.save(documento);
        log.info("[finaliza] DocumentoInfraRepository - salva");
        return documento;
    }

    @Override
    public List<Documento> listaDocumentosPorBeneficiario(UUID idBeneficiario) {
        log.info("[inicia] DocumentoInfraRepository - listaDocumentosPorBeneficiario");
        List<Documento> documentos = documentoSpringDataJPARepository.findByIdBeneficiario(idBeneficiario);
        log.info("[finaliza] DocumentoInfraRepository - listaDocumentosPorBeneficiario");
        return documentos;
    }
}