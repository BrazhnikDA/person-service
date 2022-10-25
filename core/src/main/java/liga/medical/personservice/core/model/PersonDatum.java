package liga.medical.personservice.core.model;

import javax.persistence.Entity;
import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@javax.persistence.Table(name = "person_data")
@Entity
public class PersonDatum {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private Long id;

    @javax.persistence.Column(name = "last_name", nullable = false)
    private String lastName;

    @javax.persistence.Column(name = "first_name", nullable = false)
    private String firstName;

    @javax.persistence.Column(name = "birth_dt", nullable = false)
    private LocalDate birthDt;

    @javax.persistence.Column(name = "age")
    private Short age;

    @javax.persistence.Column(name = "sex", nullable = false, length = 1)
    private String sex;

    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY, optional = false)
    @javax.persistence.JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

    @javax.persistence.OneToOne(fetch = javax.persistence.FetchType.LAZY, optional = false)
    @javax.persistence.JoinColumn(name = "medical_card_id", nullable = false)
    private MedicalCard medicalCard;

    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY)
    @javax.persistence.JoinColumn(name = "parent_id")
    private PersonDatum parent;

    @javax.persistence.OneToMany(mappedBy = "parent")
    private Set<PersonDatum> personData = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirthDt() {
        return birthDt;
    }

    public void setBirthDt(LocalDate birthDt) {
        this.birthDt = birthDt;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    public PersonDatum getParent() {
        return parent;
    }

    public void setParent(PersonDatum parent) {
        this.parent = parent;
    }

    public Set<PersonDatum> getPersonData() {
        return personData;
    }

    public void setPersonData(Set<PersonDatum> personData) {
        this.personData = personData;
    }

}