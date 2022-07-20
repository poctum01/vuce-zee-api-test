package pe.gob.vuce.zee.api.test.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "test_person")
public class PersonModel {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name="UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "vems_person_id", unique = true, nullable = false)
    private UUID id;

    @Column(name = "test_person_name", nullable = false)
    private String name;

    @Column(name = "test_person_age", nullable = false)
    private Integer age;
}
