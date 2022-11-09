package liga.medical.personservice.core.controller;

import liga.medical.personservice.core.model.SignalsData;
import liga.medical.personservice.core.service.SignalsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/signal")
public class SignalsController {
    private SignalsService signalsService;

    public SignalsController(SignalsService signalsService) {
        this.signalsService = signalsService;
    }

    @GetMapping
    public List<SignalsData> getAllPersonData() {
        return signalsService.getSignalsData();
    }

    @PostMapping
    public Integer insertPersonData(@RequestBody SignalsData signalsData) {
        return signalsService.addSignal(signalsData);
    }
}

