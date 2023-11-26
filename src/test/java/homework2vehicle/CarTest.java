package homework2vehicle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private static Car car;

    @BeforeEach
    void beforeEach() {
        car = new Car("Volvo", "s3110", 2007);
    }

    // - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя оператор instanceof).

    @Test
    void testIfCarIsVehicle(){
        assertTrue(car instanceof Vehicle);
    }

    //- Проверить, что объект Car создается с 4-мя колесами.

    @Test
    public void howManyWHeelsInCar(){
        assertEquals(4, car.getNumWheels());
    }
    //- Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).

    @Test
    void testDrive() {
        assertEquals(60, car.testDrive());
    }
    //- Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина останавливается (speed = 0).

    @Test
    void park() {
        car.testDrive();
        assertEquals(0, car.park());
    }

}