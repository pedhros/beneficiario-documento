package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("v1/beneficiario")
public interface BeneficiarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	BeneficiarioResponse postBeneficiario(@Valid @RequestBody BeneficiarioRequest beneficiarioRequest);

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	List<BeneficiarioListResponse> getTodosBeneficiarios();
	
	@GetMapping(value = "/{idBeneficiario}")
	@ResponseStatus(code = HttpStatus.OK)
	BeneficiarioDetalhadoResponse getBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);

	@DeleteMapping(value = "/{idBeneficiario}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	void deletaBeneficiarioAtravesId(@PathVariable UUID idBeneficiario);
}