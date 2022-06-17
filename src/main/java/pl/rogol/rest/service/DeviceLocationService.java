package pl.rogol.rest.service;

import org.springframework.stereotype.Service;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.repository.DeviceLocationRepository;

import java.util.List;

@Service
public class DeviceLocationService {

    private final DeviceLocationRepository deviceLocationRepository;

    public DeviceLocationService(DeviceLocationRepository deviceLocationRepository) {
        this.deviceLocationRepository = deviceLocationRepository;
    }

    public List<DeviceLocation> getLocationsOfDevices(){
        return deviceLocationRepository.findAll();
    }

    public List<DeviceLocation> getDeviceLocations(int deviceID){
        return deviceLocationRepository.findByDeviceID(deviceID);
    }


    public DeviceLocation addDeviceLocation(DeviceLocation deviceLocation) {
        return deviceLocationRepository.save(deviceLocation);
    }
}
