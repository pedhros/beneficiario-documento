package br.com.wakanda.beneficiario_documento.documento.application.service;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoAlteracaoRequest;
import org.springframework.stereotype.Service;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoResponse;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class  DocumentoApplicationService implements DocumentoService {
	private final DocumentoRepository documentoRepository;

	@Override
	public DocumentoResponse criaDocumento(DocumentoRequest documentoRequest, UUID idBeneficiario) {
		log.info("[inicia] DocumentoApplicationService - criaDocumento");
		Documento documento = new Documento(documentoRequest, idBeneficiario);
		documentoRepository.salva(documento);
		log.info("[finaliza] DocumentoApplicationService - criaDocumento");
		return DocumentoResponse.builder().idDocumento(documento.getIdDocumento()).build();
	}

	@Override
	public Documento buscaDocumentoPorId(UUID idDocumento) {
		log.info("[inicia] DocumentoApplicationService - buscaDocumentoPorId");
		Documento documento = documentoRepository.buscaDocumentoPorId(idDocumento);
		log.info("[finaliza] DocumentoApplicationService - buscaDocumentoPorId");
		return documento;
	}

	@Override
	public void alteraDocumento(UUID idDocumento, DocumentoAlteracaoRequest documentoAlteracaoRequest) {
		log.info("[inicia] DocumentoResponse - alteraDocumento");
		Documento documento = documentoRepository.buscaDocumentoPorId(idDocumento);
		documento.alteraDocumento(documentoAlteracaoRequest);
		documentoRepository.salva(documento);
		log.info("[finaliza] DocumentoResponse - alteraDocumento");
	}
}