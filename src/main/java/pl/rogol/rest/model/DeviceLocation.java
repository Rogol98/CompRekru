package pl.rogol.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class DeviceLocation {

    public DeviceLocation(Long deviceLocationID, LocalDateTime timeOfMeasurement, int deviceID, int longitude, int latitude) {
        this.deviceLocationID = deviceLocationID;
        this.timeOfMeasurement = timeOfMeasurement;
        this.deviceID = deviceID;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public DeviceLocation() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deviceLocationID;
    private LocalDateTime timeOfMeasurement;
    private int deviceID;
    private int longitude;
    private int latitude;

    public LocalDateTime getTimeOfMeasurement() {
        return timeOfMeasurement;
    }

    public Long getDeviceLocationID() {
        return deviceLocationID;
    }

    public int getDeviceID() {
        return deviceID;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

}
