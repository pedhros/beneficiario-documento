package br.com.wakanda.beneficiario_documento.documento.infra;

import br.com.wakanda.beneficiario_documento.documento.application.repository.DocumentoRepository;
import br.com.wakanda.beneficiario_documento.documento.domain.Documento;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Log4j2
@Repository
public class DocumentoInfraRepository implements DocumentoRepository {
    @Override
    public void salva(Documento documento) {
        log.info("[inicia] DocumentoInfraRepository - salva");

        log.info("[finaliza] DocumentoInfraRepository - salva");
    }
}