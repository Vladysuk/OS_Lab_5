package ua.lviv.iot.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "meteostation_data")
public class MeteostationData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "temperature")
    private Float temperature;
    @Column(name = "humidity")
    private Float humidity;
    @Column(name = "wind_speed")
    private Float windSpeed;
    @Column(name = "atmospheric_pressure")
    private Float atmosphericPressure;

    @ManyToOne
    @JoinColumn(name = "wind_direction_id")
    private WindDirection windDirection;

    @ManyToOne
    @JoinColumn(name = "meteostation_id")
    private Meteostation meteostation;

    public MeteostationData() {
    }

    public MeteostationData(Float temperature, Float humidity, Float windSpeed, Float atmosphericPressure,
                            WindDirection windDirection, Meteostation meteostation) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.atmosphericPressure = atmosphericPressure;
        this.windDirection = windDirection;
        this.meteostation = meteostation;
    }

    public MeteostationData(Integer id, Float temperature, Float humidity, Float windSpeed, Float atmosphericPressure,
                            WindDirection windDirection, Meteostation meteostation) {
        this.id = id;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.atmosphericPressure = atmosphericPressure;
        this.windDirection = windDirection;
        this.meteostation = meteostation;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public Float getHumidity() {
        return humidity;
    }

    public void setHumidity(Float humidity) {
        this.humidity = humidity;
    }

    public Float getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(Float windSpeed) {
        this.windSpeed = windSpeed;
    }

    public Float getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(Float atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
    }

    public WindDirection getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(WindDirection windDirection) {
        this.windDirection = windDirection;
    }

    public Meteostation getMeteostation() {
        return meteostation;
    }

    public void setMeteostation(Meteostation meteostation) {
        this.meteostation = meteostation;
    }

    @Override
    public String toString() {
        return "MeteostationData[" +
                "id=" + id +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                ", windSpeed=" + windSpeed +
                ", atmosphericPressure=" + atmosphericPressure +
                ", windDirection=" + windDirection.getDirection() +
                ", meteostation=" + meteostation.getId() +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MeteostationData that = (MeteostationData) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(temperature, that.temperature) &&
                Objects.equals(humidity, that.humidity) &&
                Objects.equals(windSpeed, that.windSpeed) &&
                Objects.equals(atmosphericPressure, that.atmosphericPressure) &&
                Objects.equals(windDirection, that.windDirection) &&
                Objects.equals(meteostation, that.meteostation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, temperature, humidity, windSpeed, atmosphericPressure, windDirection, meteostation);
    }
}
