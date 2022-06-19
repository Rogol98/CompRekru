package pl.rogol.rest;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.repository.DeviceLocationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
class AppTests {

  @Autowired DeviceLocationRepository dlRepository;

  @Test
  @Order(1)
  public void testCreate() {
    DeviceLocation dl = new DeviceLocation();
    dl.setDeviceLocationID(1L);
    dl.setDeviceID(145);
    dl.setLatitude(6798677);
    dl.setLongitude(5687587);
    dl.setTimeOfMeasurement(LocalDateTime.parse("2021-12-03T07:05:30"));
    dlRepository.save(dl);
    assertNotNull(dlRepository.findById(1L).orElse(null));
  }

  @Test
  @Order(2)
  public void testGetAll() {
    List<DeviceLocation> list = dlRepository.findAll();
    assertThat(list).size().isGreaterThan(0);
  }

  @Test
  @Order(3)
  public void testSingleDeviceLocation () {
    DeviceLocation DeviceLocation = dlRepository.findById(1L).orElse(null);
    assert DeviceLocation != null;
    assertEquals(6798677, DeviceLocation.getLatitude());
  }

  @Test
  @Order(4)
  public void testUpdate() {
    DeviceLocation dl = dlRepository.findById(1L).orElse(null);
    assert dl != null;
    dl.setLatitude(654898);
    dlRepository.save(dl);
    assertNotEquals(6798677, Objects.requireNonNull(dlRepository.findById(1L).orElse(null)).getLatitude());
  }


  
  
}
