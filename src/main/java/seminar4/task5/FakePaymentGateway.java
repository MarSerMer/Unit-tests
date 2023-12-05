package seminar4.task5;

public class FakePaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // Имитируем успешную обработку платежа
        System.out.println("Поддельный платеж успешно обработан.");
    }
}