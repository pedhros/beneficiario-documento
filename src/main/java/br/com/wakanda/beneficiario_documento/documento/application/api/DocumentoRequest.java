package br.com.wakanda.beneficiario_documento.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class DocumentoRequest {
    @NotNull
    private TipoDocumento tipoDocumento;
    @NotBlank
    private String descricao;
}