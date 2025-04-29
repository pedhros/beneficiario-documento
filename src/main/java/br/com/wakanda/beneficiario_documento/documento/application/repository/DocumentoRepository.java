package br.com.wakanda.beneficiario_documento.documento.application.repository;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;

import java.util.List;
import java.util.UUID;

public interface DocumentoRepository  {
	 Documento salva(Documento documento);
    Documento buscaDocumentoPorId(UUID idDocumento);
}