package liga.medical.personservice.core.service;

import liga.medical.personservice.core.mapping.MedicalMapper;
import liga.medical.personservice.core.model.MedicalCard;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalService {

    private final MedicalMapper medicalMapper;

    public MedicalService(MedicalMapper medicalMapper) {
        this.medicalMapper = medicalMapper;
    }

    public List<MedicalCard> getMedicalCard() {
        return medicalMapper.getListMedicalCard();
    }

    public Integer addMedicalCard(MedicalCard medicalCard) {
        return medicalMapper.addMedicalCard(medicalCard);
    }
}
