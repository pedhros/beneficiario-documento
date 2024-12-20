package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import lombok.Value;

@Value
public class DocumentosRequest {
	 private Beneficiario beneficiario;
	 private String tipoDocumento;
	 private String descricao;
}