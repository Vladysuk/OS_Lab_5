package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "street")
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "street_name", length = 45)
    private String streetName;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    public Street() {}

    public Street(String streetName, City city) {
        this.streetName = streetName;
        this.city = city;
    }

    public Street(Integer id, String streetName, City city) {
        this.id = id;
        this.streetName = streetName;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Street[" +
                "id=" + id +
                ", streetName='" + streetName + '\'' +
                ", city=" + city +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(id, street.id) &&
                Objects.equals(streetName, street.streetName) &&
                Objects.equals(city, street.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, streetName, city);
    }
}
