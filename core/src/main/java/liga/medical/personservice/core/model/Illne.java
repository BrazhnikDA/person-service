package liga.medical.personservice.core.model;

import javax.persistence.Entity;
import java.time.Instant;
import java.time.LocalDate;

@javax.persistence.Table(name = "illnes")
@Entity
public class Illne {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private Long id;

    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY, optional = false)
    @javax.persistence.JoinColumn(name = "medical_card_id", nullable = false)
    private MedicalCard medicalCard;

    @javax.persistence.Column(name = "type_id")
    private Long typeId;

    @javax.persistence.Column(name = "heaviness", length = 1)
    private String heaviness;

    @javax.persistence.Column(name = "appearance_dttm", nullable = false)
    private Instant appearanceDttm;

    @javax.persistence.Column(name = "recovery_dt")
    private LocalDate recoveryDt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getHeaviness() {
        return heaviness;
    }

    public void setHeaviness(String heaviness) {
        this.heaviness = heaviness;
    }

    public Instant getAppearanceDttm() {
        return appearanceDttm;
    }

    public void setAppearanceDttm(Instant appearanceDttm) {
        this.appearanceDttm = appearanceDttm;
    }

    public LocalDate getRecoveryDt() {
        return recoveryDt;
    }

    public void setRecoveryDt(LocalDate recoveryDt) {
        this.recoveryDt = recoveryDt;
    }

}