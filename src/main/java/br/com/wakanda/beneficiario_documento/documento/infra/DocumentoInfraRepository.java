package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import br.com.wakanda.beneficiario_documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
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
    public Documento buscaDocumentoPorId(UUID idDocumento) {
        log.info("[inicia] DocumentoInfraRepository - buscaDocumentoPorId");
        Documento documento = documentoSpringDataJPARepository.findById(idDocumento)
                .orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Documento não encontrado"));
        log.info("[finaliza] DocumentoInfraRepository - buscaDocumentoPorId");
        return documento;
    }
}