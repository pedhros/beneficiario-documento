package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.Builder;
import lombok.Value;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Value
@Builder
public class DocumentoResponse {
    private UUID idDocumento;

}