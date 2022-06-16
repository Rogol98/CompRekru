package pl.rogol.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.repository.DeviceLocationRepository;

import java.util.List;

@RestController
public class DeviceLocationController {

DeviceLocationRepository dLRepository;

    @GetMapping("/device-locations/{deviceID}")
    public ResponseEntity<List<DeviceLocation>> getDeviceLocations(@RequestParam int deviceID){
    return new ResponseEntity<>(dLRepository.findByDeviceID(deviceID), HttpStatus.OK);
    }


}
