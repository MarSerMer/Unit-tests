package seminar1calculator;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divider cannot be zero");
        }
        return (double) a / b;
    }

    // Задание 1. ** В классе Calculator создайте метод calculateDiscount, который принимает сумму
    // покупки и процент скидки и возвращает сумму с учетом скидки.
    // Ваша задача - проверить этот метод с использованием библиотеки AssertJ.
    // Если метод calculateDiscount получает недопустимые аргументы,
    // он должен выбрасывать исключение ArithmeticException.
    // Не забудьте написать тесты для проверки этого поведения.

    public double calculateDiscount(int sumOfOrder, double discount){
        if (sumOfOrder<0 || discount<0 || discount>=1){
            throw new ArithmeticException("Неверные данные");
        }
        double res = sumOfOrder * (1-discount);
        return res;
    }
}
