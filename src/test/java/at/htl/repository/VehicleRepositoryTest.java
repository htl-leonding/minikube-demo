package at.htl.repository;

import at.htl.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import jakarta.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
@QuarkusTest
class VehicleRepositoryTest {

    @Inject
    VehicleRepository vehicleRepository;

    @Test
    @Transactional
    void createRecordSmokeTest() {

        var myCar = new Vehicle("Opel", "Kadett");
        vehicleRepository.persist(myCar);
    }


}