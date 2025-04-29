package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import org.springframework.stereotype.Controller;

import br.com.wakanda.beneficiario_documento.documento.application.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import javax.swing.event.DocumentEvent;
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
	public DocumentoDetalhadoResponse getDocumentosBeneficiarioAtravesId(UUID idDocumento) {
		log.info("[inicia] DocumentoResponse - getDocumentosBeneficiarioAtravesId");
		Documento documento = documentoService.buscaDocumentoPorId(idDocumento);
		log.info("[finaliza] DocumentoResponse - getDocumentosBeneficiarioAtravesId");
		return new DocumentoDetalhadoResponse(documento);
	}

	@Override
	public void patchAlteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
		log.info("[inicia] DocumentoResponse - patchAlteraDocumento");
		documentoService.alteraDocumento(idDocumento, documentoAlteracaoRequest);
		log.info("[finaliza] DocumentoResponse - patchAlteraDocumento");
	}
}