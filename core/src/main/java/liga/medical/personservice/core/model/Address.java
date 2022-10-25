package liga.medical.personservice.core.model;

import javax.persistence.Entity;

@javax.persistence.Table(name = "address")
@Entity
public class Address {
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", nullable = false)
    private Long id;

    @javax.persistence.ManyToOne(fetch = javax.persistence.FetchType.LAZY, optional = false)
    @javax.persistence.JoinColumn(name = "contact_id", nullable = false)
    private Contact contact;

    @javax.persistence.Column(name = "country_id", nullable = false)
    private Long countryId;

    @javax.persistence.Column(name = "city", nullable = false)
    private String city;

    @javax.persistence.Column(name = "index")
    private Integer index;

    @javax.persistence.Column(name = "street", nullable = false)
    private String street;

    @javax.persistence.Column(name = "building", nullable = false, length = 32)
    private String building;

    @javax.persistence.Column(name = "flat", length = 32)
    private String flat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }

}