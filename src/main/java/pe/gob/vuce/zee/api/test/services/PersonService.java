package pe.gob.vuce.zee.api.test.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import pe.gob.vuce.zee.api.test.models.PersonModel;
import pe.gob.vuce.zee.api.test.repositories.PersonRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Function;

@Service
public class PersonService implements PersonRepository {

    @Autowired
    PersonRepository personRepository;

    @Override
    public List<PersonModel> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<PersonModel> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<PersonModel> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<PersonModel> findAllById(Iterable<UUID> uuids) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(UUID uuid) {
        personRepository.deleteById(uuid);
    }

    @Override
    public void delete(PersonModel entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends UUID> uuids) {

    }

    @Override
    public void deleteAll(Iterable<? extends PersonModel> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends PersonModel> S save(S entity) {
        return personRepository.save(entity);
    }

    @Override
    public <S extends PersonModel> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<PersonModel> findById(UUID uuid) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(UUID uuid) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends PersonModel> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends PersonModel> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<PersonModel> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<UUID> uuids) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public PersonModel getOne(UUID uuid) {
        return null;
    }

    @Override
    public PersonModel getById(UUID uuid) {
        return null;
    }

    @Override
    public <S extends PersonModel> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends PersonModel> List<S> findAll(Example<S> example) {
        return (List<S>) personRepository.findAll();
    }

    @Override
    public <S extends PersonModel> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends PersonModel> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends PersonModel> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends PersonModel> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends PersonModel, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
