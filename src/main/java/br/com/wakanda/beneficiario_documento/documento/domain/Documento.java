package br.com.wakanda.beneficiario_documento.documento.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.wakanda.beneficiario_documento.documento.application.api.DocumentoRequest;
import br.com.wakanda.beneficiario_documento.documento.application.api.TipoDocumento;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Documento {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", name = "id", updatable = false, unique = true, nullable = false)
    private UUID idDocumento;
    @Column(name = "beneficiario_id", nullable = false)
    private UUID beneficiarioId;
    @NotBlank
    private String tipoDocumento;
    @NotBlank
    private String descricao;
    
    private LocalDateTime dataInclusao;
    private LocalDateTime dataAtualizacao;
    
    public Documento(DocumentoRequest documentoRequest, UUID idBeneficiario) {
		this.beneficiarioId = idBeneficiario;
		this.tipoDocumento = documentoRequest.getTipoDocumento();
		this.descricao =  documentoRequest.getDescricao();
        this.dataInclusao = LocalDateTime.now();
	}
}