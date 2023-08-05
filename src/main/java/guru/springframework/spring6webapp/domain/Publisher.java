package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Objects;

/**
 * Created by rd, Aubay.

 * Create new Entity called Publisher
    * POJO with properties for id, and publisherName, address, city, state, zip
    * Annotate with necessary JPA annotations
    * Add toString, equals, and hashCode

 * Create Spring Data JPA repository
 * Add to Bootstrap class and create new publisher
    * Verify database count using System.out.println
 */

@Entity
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publisherName;
    private String address;
    private String city;
    private String state;
    private String zip;

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher publisher)) return false;
        return Objects.equals(getId(), publisher.getId()) && Objects.equals(getPublisherName(), publisher.getPublisherName()) && Objects.equals(getAddress(), publisher.getAddress()) && Objects.equals(getCity(), publisher.getCity()) && Objects.equals(getState(), publisher.getState()) && Objects.equals(getZip(), publisher.getZip());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getPublisherName(), getAddress(), getCity(), getState(), getZip());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
