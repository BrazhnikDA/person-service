package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.MedicalCard;
import liga.medical.personservice.core.service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/medical_card")
public class MedicalController {

    private MedicalService medicalService;

    @Autowired
    public MedicalController(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @GetMapping
    public List<MedicalCard> getMedicalCard() {
        return medicalService.getMedicalCard();
    }

    @PostMapping
    public Integer addMedicalCard(@RequestBody MedicalCard medicalCard) {
        return medicalService.addMedicalCard(medicalCard);
    }

}
