package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import org.springframework.stereotype.Controller;

import br.com.wakanda.beneficiario_documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.UUID;

@Log4j2
@RequiredArgsConstructor
@Controller
public class DocumentoController implements DocumentoAPI {
	private final DocumentoService documentoService;

	@Override
	public DocumentoResponse postDocumento(DocumentoRequest documentoRequest, UUID idBeneficiario) {
		log.info("[inicia] DocumentoResponse - postDocumento");
		DocumentoResponse documentoResponse = documentoService.criaDocumento(documentoRequest, idBeneficiario);
		log.info("[finaliza] DocumentoResponse - postDocumento");
		return documentoResponse;
	}

	@Override
	public List<DocumentoResponse> listaDocumentosBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[inicia] DocumentoResponse - listaDocumentosBeneficiarioAtravesId");
		List<DocumentoResponse> documentoResponse = documentoService.listarDocumentosPorBeneficiario(idBeneficiario);
		log.info("[finaliza] DocumentoResponse - listaDocumentosBeneficiarioAtravesId");
		return documentoResponse;
	}


}