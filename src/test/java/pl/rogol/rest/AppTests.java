package pl.rogol.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import pl.rogol.rest.model.DeviceLocation;
import pl.rogol.rest.repository.DeviceLocationRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestMethodOrder(OrderAnnotation.class)
@AutoConfigureMockMvc
class AppTests {

    @Autowired
    DeviceLocationRepository dlRepository;

    @Autowired
    private MockMvc mvc;


    @Test
    @Order(1)
    void testCreate() {
        DeviceLocation dl = new DeviceLocation();
        dl.setDeviceLocationID(1L);
        dl.setDeviceID(145);
        dl.setLatitude(67987);
        dl.setLongitude(-56587);
        dl.setTimeOfMeasurement(LocalDateTime.parse("2021-12-03T07:05:30"));
        dlRepository.save(dl);
        assertNotNull(dlRepository.findById(1L).orElse(null));
    }

    @Test
    @Order(2)
    void testGetAll() {
        List<DeviceLocation> list = dlRepository.findAll();
        assertThat(list).size().isPositive();
    }

    @Test
    @Order(3)
    void testSingleDeviceLocation() {
        DeviceLocation DeviceLocation = dlRepository.findById(1L).orElse(null);
        assert DeviceLocation != null;
        assertEquals(67987, DeviceLocation.getLatitude());
    }

    @Test
    @Order(4)
    void testUpdate() {
        DeviceLocation dl = dlRepository.findById(1L).orElse(null);
        assert dl != null;
        dl.setLatitude(654898);
        dlRepository.save(dl);
        assertNotEquals(6798677, Objects.requireNonNull(dlRepository.findById(1L).orElse(null)).getLatitude());
    }

    @Test
    @Order(5)
    void testBadRequest() throws Exception {
        DeviceLocation dl = new DeviceLocation(2L, null, 15, 53453, -23423);
        mvc.perform(post("/device-locations").content(asJsonString(dl)).contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)).andExpect(status().isBadRequest());
    }

    private static String asJsonString(final Object obj) {
        try {
            final ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
