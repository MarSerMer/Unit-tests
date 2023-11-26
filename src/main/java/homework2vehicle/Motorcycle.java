package homework2vehicle;

public class Motorcycle extends Vehicle{
    // Класс ""Motorcycle"" также расширяет ""Vehicle"" и реализует его абстрактные методы.
    // При создании объекта ""Motorcycle"", число колес устанавливается в 2, а скорость в 0.
    // В методе ""testDrive()"" скорость устанавливается на 75, а в методе ""park()"" - обратно в 0.

    //region Constructors
    public Motorcycle(String company, String model, int yearRelease){
        this.company = company;
        this.model = model;
        this.yearRelease = yearRelease;
        this.numWheels = 2;
        this.speed = 0;
    }
    //endregion

    // region Methods
    @Override
    public int testDrive(){
        if (this.speed == 0) {
            this.speed = 75;
            return this.speed;
        }
        else {
            throw new RuntimeException("Какие-то проблемы со скоростью автомобиля, тест-драйв невозможен");
        }
    }

    @Override
    public int park(){
        if (this.speed == 75) {
            this.speed = 0;
            return this.speed;
        }
        else {
            throw new RuntimeException("Какие-то проблемы со скоростью автомобиля, парковка невозможна");
        }
    }
    //endregion
}
