package pl.rogol.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class DeviceLocation {

    public DeviceLocation(
            Long deviceLocationID,
            LocalDateTime timeOfMeasurement,
            int deviceID,
            int longitude,
            int latitude) {
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
    @NotNull
    private LocalDateTime timeOfMeasurement;
    @NotNull
    @Min(value = 1, message = "Device ID has to be positive integer")
    private int deviceID;
    @NotNull
    @Min(value = -1_800_000, message = "longitude should be higher than -1_800_000")
    @Max(value = 1_800_000, message = "longitude should be lower than 1_800_000")
    private int longitude;
    @NotNull
    @Min(value = -900_000, message = "latitude should be higher than -900_000")
    @Max(value = 900_000, message = "latitude should be lower than 900_000")
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

    public void setDeviceLocationID(Long deviceLocationID) {
        this.deviceLocationID = deviceLocationID;
    }

    public void setTimeOfMeasurement(LocalDateTime timeOfMeasurement) {
        this.timeOfMeasurement = timeOfMeasurement;
    }

    public void setDeviceID(int deviceID) {
        this.deviceID = deviceID;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }
}
