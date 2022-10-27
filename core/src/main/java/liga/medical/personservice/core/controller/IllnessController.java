package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.service.IllnessService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/illness")
public class IllnessController {

    private IllnessService illnessService;

    public IllnessController(IllnessService illnessService) {
        this.illnessService = illnessService;
    }

    @GetMapping
    public List<Illness> getAllIllnesses() {
        return illnessService.getIllness();
    }

    @PostMapping
    public Integer insertIllness(@RequestBody Illness illness) {
        return illnessService.addIllness(illness);
    }
}