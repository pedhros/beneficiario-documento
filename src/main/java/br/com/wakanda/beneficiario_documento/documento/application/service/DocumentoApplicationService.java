package br.com.wakanda.beneficiario_documento.documento.application.service;

import org.springframework.stereotype.Service;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentosRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentosResponse;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class DocumentoApplicationService implements DocumentoService {
	private final DocumentoRepository documentoRepository;

	@Override
	public DocumentosResponse criaDocumento(DocumentosRequest documentosRequest) {
		log.info("[inicia] DocumentoApplicationService - criaDocumento");
		documentoRepository.salva(new Documento(documentosRequest));
		log.info("[finaliza] DocumentoApplicationService - criaDocumento");
		return null;
	}
}