package br.com.wakanda.beneficiario_documento.beneficiario.infra;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.wakanda.beneficiario_documento.beneficiario.application.repository.BeneficiarioRepository;
import br.com.wakanda.beneficiario_documento.beneficiario.domain.Beneficiario;
import br.com.wakanda.beneficiario_documento.handler.APIException;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class BeneficiarioInfraRepository implements BeneficiarioRepository {

	private final BeneficiarioSpringDataJPARepository beneficiarioSpringDataJPARepository;

	@Override
	public Beneficiario salva(Beneficiario beneficiario) {
		log.info("[inicia] BeneficiarioInfraRepository - salva");
		beneficiarioSpringDataJPARepository.save(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository - salva");
		return beneficiario;
	}

	@Override
	public List<Beneficiario> buscaTodosBeneficiarios() {
		log.info("[inicia] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
		List<Beneficiario> todosBeneficiarios = beneficiarioSpringDataJPARepository.findAll();
		log.info("[finaliza] BeneficiarioInfraRepository - buscaTodosBeneficiarios");
		return todosBeneficiarios;
	}

	@Override
	public Beneficiario buscaBeneficiarioAtravesId(UUID idBeneficiario) {
		log.info("[inicia] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
		Beneficiario beneficiario = beneficiarioSpringDataJPARepository.findById(idBeneficiario)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Beneficiário não encontrado!"));
		log.info("[finaliza] BeneficiarioInfraRepository - buscaBeneficiarioAtravesId");
		return beneficiario;
	}

	@Override
	public void deletaBeneficiario(Beneficiario beneficiario) {
		log.info("[inicia] BeneficiarioInfraRepository - deletaBeneficiario");
		beneficiarioSpringDataJPARepository.delete(beneficiario);
		log.info("[finaliza] BeneficiarioInfraRepository - deletaBeneficiario");
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Beneficiario> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Beneficiario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Beneficiario getOne(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beneficiario getById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Beneficiario getReferenceById(UUID id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Beneficiario> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Beneficiario> findAllById(Iterable<UUID> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Beneficiario> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public boolean existsById(UUID id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Beneficiario entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllById(Iterable<? extends UUID> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Beneficiario> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Beneficiario> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Beneficiario> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public <S extends Beneficiario> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Beneficiario> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Beneficiario> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public <S extends Beneficiario, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		// TODO Auto-generated method stub
		return null;
	}
}
