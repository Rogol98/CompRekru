package pl.rogol.rest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DeviceLocation {

    public DeviceLocation(){}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deviceLocationID;
    private int deviceID;
    private int longitude;
    private int latitude;



}
