package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicalController {

    private final MedicalService medicalService;

    @Autowired
    public MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @GetMapping(path = "/medical_card", produces = "application/json")
    public List<MedicalCard> getMedicalCard() {
        return medicalService.getMedicalCard();
    }

}
