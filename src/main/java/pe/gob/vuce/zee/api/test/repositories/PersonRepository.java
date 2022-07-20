package pe.gob.vuce.zee.api.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.gob.vuce.zee.api.test.models.PersonModel;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonModel, UUID> {

}
