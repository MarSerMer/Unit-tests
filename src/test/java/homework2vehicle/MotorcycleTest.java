package homework2vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    private static Motorcycle moto;

    @BeforeEach
    void beforeEach(){
        moto = new Motorcycle("HarleyDavidson", "TheBeast", 1973);
    }
    //- Проверить, что объект Motorcycle создается с 2-мя колесами.

    @Test
    void howManyWheelsInMoto(){
        assertEquals(2, moto.numWheels);
    }
    //- Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void testDrive() {
        assertEquals(75, moto.testDrive());
    }

    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл останавливается (speed = 0).

    @Test
    void park() {
        moto.testDrive();
        assertEquals(0, moto.park());
    }
}