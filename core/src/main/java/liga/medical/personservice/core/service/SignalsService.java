package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.SignalsMapper;
import liga.medical.personservice.core.model.SignalsData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignalsService {
    private SignalsMapper signalsMapper;

    public SignalsService(SignalsMapper signalsMapper) {
        this.signalsMapper = signalsMapper;
    }

    public List<SignalsData> getSignalsData() {
        return signalsMapper.getListSignals();
    }

    public int addSignal(SignalsData signalsData) {
        return signalsMapper.addSignal(signalsData);
    }
}
