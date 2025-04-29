package br.com.wakanda.beneficiario_documento.documento.application.api;

import br.com.wakanda.beneficiario_documento.beneficiario.application.api.BeneficiarioListResponse;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("v1/documento")
public interface DocumentoAPI {
	@PostMapping("/{idBeneficiario}/novos-documentos")
	@ResponseStatus(code = HttpStatus.CREATED)
	DocumentoResponse postDocumento(@Valid @RequestBody DocumentoRequest documentoRequest,
									@PathVariable UUID idBeneficiario);

	@GetMapping("/buscaDocumentos/{idDocumento}")
	@ResponseStatus(code = HttpStatus.OK)
	DocumentoDetalhadoResponse getDocumentosBeneficiarioAtravesId(@PathVariable UUID idDocumento);

	@PatchMapping("/edita-documento/{idDocumento}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void patchAlteraDocumento(@PathVariable UUID idDocumento,
			@Valid @RequestBody DocumentoAlteracaoRequest documentoAlteracaoRequest);
}