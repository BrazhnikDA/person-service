package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.PersonData;
import liga.medical.personservice.core.service.PersonDataService;
import org.springframework.web.bind.annotation.*;

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