package liga.medical.personservice.core.model;

import javax.persistence.Entity;
import java.util.LinkedHashSet;
import java.util.Set;

@javax.persistence.Table(name = "contact")
@Entity
public class Contact {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private Long id;

    @javax.persistence.Column(name = "phone_number", nullable = false, length = 32)
    private String phoneNumber;

    @javax.persistence.Column(name = "email", length = 128)
    private String email;

    @javax.persistence.Lob
    @javax.persistence.Column(name = "profile_link")
    private String profileLink;

    @javax.persistence.OneToMany(mappedBy = "contact")
    private Set<PersonDatum> personData = new LinkedHashSet<>();

    @javax.persistence.OneToMany(mappedBy = "contact")
    private Set<Address> addresses = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfileLink() {
        return profileLink;
    }

    public void setProfileLink(String profileLink) {
        this.profileLink = profileLink;
    }

    public Set<PersonDatum> getPersonData() {
        return personData;
    }

    public void setPersonData(Set<PersonDatum> personData) {
        this.personData = personData;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(Set<Address> addresses) {
        this.addresses = addresses;
    }

}