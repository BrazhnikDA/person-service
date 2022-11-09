package liga.medical.personservice.core.controller;

import liga.medical.dto.annotations.DbLog;
import liga.medical.personservice.core.model.Illness;
import liga.medical.personservice.core.service.IllnessService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RestController
@RequestMapping("/illness")
public class IllnessController {

    private IllnessService illnessService;

    public IllnessController(IllnessService illnessService) {
        this.illnessService = illnessService;
    }

    @GetMapping
    @DbLog
    public List<Illness> getAllIllnesses() {
        return illnessService.getIllness();
    }

    @PostMapping
    @DbLog
    public Integer insertIllness(@RequestBody Illness illness) {
        return illnessService.addIllness(illness);
    }
}