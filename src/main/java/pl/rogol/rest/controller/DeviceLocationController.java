package pl.rogol.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.service.DeviceLocationService;

import java.util.List;

@RestController
public class DeviceLocationController {

  private final DeviceLocationService dLService;

  public DeviceLocationController(DeviceLocationService dLService) {
    this.dLService = dLService;
  }

  @GetMapping("/device-locations/{deviceID}")
  public List<DeviceLocation> getDeviceLocations(@RequestParam int deviceID) {
    return dLService.getDeviceLocations(deviceID);
  }
}
