package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/person_data")
public class PersonDataController {

    private PersonDataService personDataService;

    public PersonDataController(PersonDataService personDataService) {
        this.personDataService = personDataService;
    }

    @GetMapping
    public List<PersonData> getAllPersonData() {
        return personDataService.getPersonData();
    }

    @PostMapping
    public Integer insertPersonData(@RequestBody PersonData personData) {
        return personDataService.addPersonData(personData);
    }
}