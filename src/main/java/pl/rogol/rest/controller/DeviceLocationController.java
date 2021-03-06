package pl.rogol.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.service.DeviceLocationService;

import javax.validation.Valid;
import java.util.List;

@RestController
public class DeviceLocationController {

    private final DeviceLocationService dLService;

    @Autowired
    public DeviceLocationController(DeviceLocationService dLService) {
        this.dLService = dLService;
    }

    @GetMapping("/device-locations/{deviceID}")
    public List<DeviceLocation> getDeviceLocations(@PathVariable int deviceID) {
        return dLService.getDeviceLocations(deviceID);
    }

    @GetMapping("/device-locations")
    public List<DeviceLocation> getLocationsOfDevices() {
        return dLService.getLocationsOfDevices();
    }


    @PostMapping("/device-locations")
    public DeviceLocation addDeviceLocation(@Valid @RequestBody DeviceLocation deviceLocation) {
        return dLService.addDeviceLocation(deviceLocation);
    }


}
