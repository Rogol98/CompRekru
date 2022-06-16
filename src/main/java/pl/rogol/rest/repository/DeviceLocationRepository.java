package pl.rogol.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.rogol.rest.model.DeviceLocation;

import java.util.List;

public interface DeviceLocationRepository extends JpaRepository<DeviceLocation, Long> {

   List<DeviceLocation> findByDeviceID(int deviceID);

}
