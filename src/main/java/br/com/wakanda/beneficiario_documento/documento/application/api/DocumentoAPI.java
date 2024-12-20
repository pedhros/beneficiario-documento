package br.com.wakanda.beneficiario_documento.documento.application.api;

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
	List<DocumentoResponse> postDocumento(@Valid @RequestBody List<DocumentoRequest> documentoRequest,
										  @PathVariable UUID idBeneficiario);
}