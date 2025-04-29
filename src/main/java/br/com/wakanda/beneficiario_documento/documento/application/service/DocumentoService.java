package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoAlteracaoRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoResponse;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoService {
	DocumentoResponse criaDocumento(DocumentoRequest documentoRequest, UUID idBeneficiario);
    Documento buscaDocumentoPorId(UUID idDocumento);
    void alteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest);
}