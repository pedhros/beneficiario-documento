package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.Value;

import java.util.UUID;

@Value
public class DocumentoResponse {
    private UUID idDocumento;

    public DocumentoResponse(Documento documento) {
        this.idDocumento = documento.getIdDocumento();
    }
}
