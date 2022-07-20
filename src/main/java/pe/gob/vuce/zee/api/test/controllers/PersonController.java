package pe.gob.vuce.zee.api.test.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.gob.vuce.zee.api.test.dtos.PersonDTO;
import pe.gob.vuce.zee.api.test.models.PersonModel;
import pe.gob.vuce.zee.api.test.services.PersonService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/person/")
public class PersonController {

    @Autowired
    PersonService personService;

    @Autowired
    ModelMapper modelMapper;

    @PostMapping
    public PersonDTO save(@RequestBody PersonModel personModel) {
        PersonModel saved = personService.save(personModel);
        PersonDTO personDTO = modelMapper.map(saved, PersonDTO.class);
        return personDTO;
    }

    @PutMapping
    public PersonDTO update(@RequestBody PersonModel personModel) {
        PersonModel saved = personService.save(personModel);
        PersonDTO personDTO = modelMapper.map(saved, PersonDTO.class);
        return personDTO;
    }

    @DeleteMapping("{person_id}")
    public Boolean delete(@PathVariable("person_id") UUID person_id) {
        try {
            personService.deleteById(person_id);
            return true;
        }catch (Exception e){
        }
        return null;
    }

    @GetMapping
    public List<PersonDTO> list() {
        List<PersonModel> list = personService.findAll();
        List<PersonDTO> response = new ArrayList<>();
        for (PersonModel o : list) {
            PersonDTO personDTO = modelMapper.map(o, PersonDTO.class);
            response.add(personDTO);

        }
        return response;
    }
}
