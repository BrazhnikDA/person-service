package liga.medical.personservice.core.model.view;

import javax.persistence.Entity;

/**
 * Mapping for DB view
 */
@javax.persistence.Table(name = "view_illness_medical_card")
@Entity
public class ViewIllnessMedicalCard {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id")
    private Long id;

    @javax.persistence.Column(name = "contact_id")
    private Long contactId;

    @javax.persistence.Column(name = "city")
    private String city;

    @javax.persistence.Column(name = "index")
    private Integer index;

    @javax.persistence.Column(name = "phone_number", length = 32)
    private String phoneNumber;

    @javax.persistence.Column(name = "email", length = 128)
    private String email;

    public Long getId() {
        return id;
    }

    public Long getContactId() {
        return contactId;
    }

    public String getCity() {
        return city;
    }

    public Integer getIndex() {
        return index;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

}