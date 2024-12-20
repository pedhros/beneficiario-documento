package br.com.wakanda.beneficiario_documento.documento.application.api;

import org.springframework.stereotype.Controller;

import br.com.wakanda.beneficiario_documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Log4j2
@RequiredArgsConstructor
@Controller
public class DocumentoController implements DocumentoAPI {
	private final DocumentoService documentoService;

	@Override
	public DocumentosResponse postDocumento(DocumentosRequest documentosRequest) {
		log.info("[inicia] DocumentoController - postDocumento");
		DocumentosResponse documentoCriado = documentoService.criaDocumento(documentosRequest);
		log.info("[finaliza] DocumentoController - postDocumento");
		return documentoCriado;
	}
}