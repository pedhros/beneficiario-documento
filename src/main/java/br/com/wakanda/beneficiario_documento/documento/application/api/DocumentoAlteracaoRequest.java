package br.com.wakanda.beneficiario_documento.documento.application.api;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class DocumentoAlteracaoRequest {
    @NotNull
    private String tipoDocumento;
    @NotBlank
    private String descricao;
}