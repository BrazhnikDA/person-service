package liga.medical.personservice.core.model;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@javax.persistence.Table(name = "medical_card")
@Entity
public class MedicalCard {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private Long id;

    @javax.persistence.Lob
    @javax.persistence.Column(name = "client_status")
    private String clientStatus;

    @javax.persistence.Lob
    @javax.persistence.Column(name = "med_status")
    private String medStatus;

    @javax.persistence.Column(name = "registry_dt", nullable = false)
    private LocalDate registryDt;

    @javax.persistence.Lob
    @javax.persistence.Column(name = "comment")
    private String comment;

    @javax.persistence.OneToOne(mappedBy = "medicalCard")
    private PersonDatum personDatum;

    @javax.persistence.OneToMany(mappedBy = "medicalCard")
    private Set<Illne> illnes = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(String clientStatus) {
        this.clientStatus = clientStatus;
    }

    public String getMedStatus() {
        return medStatus;
    }

    public void setMedStatus(String medStatus) {
        this.medStatus = medStatus;
    }

    public LocalDate getRegistryDt() {
        return registryDt;
    }

    public void setRegistryDt(LocalDate registryDt) {
        this.registryDt = registryDt;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public PersonDatum getPersonDatum() {
        return personDatum;
    }

    public void setPersonDatum(PersonDatum personDatum) {
        this.personDatum = personDatum;
    }

    public Set<Illne> getIllnes() {
        return illnes;
    }

    public void setIllnes(Set<Illne> illnes) {
        this.illnes = illnes;
    }

}