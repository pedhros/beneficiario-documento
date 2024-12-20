package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentosRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentosResponse;

public interface DocumentoService {
	DocumentosResponse criaDocumento(DocumentosRequest documentosRequest);
}