package br.com.wakanda.beneficiario_documento.beneficiario.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/beneficiario")
public interface BeneficiarioAPI {
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	BeneficiarioResponse postBeneficiario(@RequestBody BeneficiarioRequest beneficiarioRequest);
}