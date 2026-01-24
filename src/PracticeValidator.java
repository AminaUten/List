import java.util.Scanner;

public class PracticeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Пожалуйста, введите сумму перевода в тенге.");
        int amount = scanner.nextInt();
        // считайте сумму перевода

        boolean isValid = TransactionValidator.isValidAmount(amount); // добавьте вызов метод isValidAmount
        if (isValid) {
            System.out.println("Спасибо! Ваш перевод на сумму " + amount + " тг. успешно выполнен.");
        }
    }
}
