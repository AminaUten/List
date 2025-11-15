import java.util.Scanner;

public class Test {
    public static void main(String[]args) {
        Scanner scam = new Scanner(System.in);
        System.out.println("Введите ваш номер телефона:");
        String number = scam.next();
        System.out.println("Введите ваш баланс:");
        int balance = scam.nextInt();
        System.out.println("1. Тарифы ");
        System.out.println("2. Мой active");
        System.out.println("Выберите команду");
        int tap = scam.nextInt();
        if (tap == 1) {
            System.out.println(" 1.  Базовый - 1790 тг");
            System.out.println(" 2.  Премиум - 5490 тг");
            System.out.println(" 3.  Безлимит- 8990 тг");
            System.out.println("Выберите тариф"); }
            else if (tap == 2) {
                System.out.println("1. Проверка баланса");
                System.out.println("2. Мой номер");
                System.out.println("Выберите действие");
                int action = scam.nextInt();
                if (action == 1) {
                    System.out.println("Ваш баланс: " + balance);
                } else if (action == 2) {
                    System.out.println("Ваш номер: " + number);
                } else {
                    System.out.println("Ошибка. Повторите заново.");
                }
            } else {
                System.out.println("Ошибка. Повторите заново.");
            }

            if (tap == 1) {
            int pack = scam.nextInt();
            if (pack == 1) {
                if (balance >= 1790) {
                    System.out.println("Вы успешно подключили базовый тариф за 1790 тг.");
                    System.out.println("Оставшийся баланс: " + (balance - 1790));
                }
                else {
                    System.out.println("Недостаточно средств! Нужно 1790 тг., а у вас только " + balance);
                }
                }
             if (pack == 2) {
                 if (balance >= 5490) {
                     System.out.println("Вы успешно подключили базовый тариф за 5490 тг.");
                     System.out.println("Оставшийся баланс: " + (balance - 5490));
                 } else {
                     System.out.println("Недостаточно средств! Нужно 5490 тг., а у вас только " + balance);
                 }
             }
            else if (pack == 3) {
                    if (balance >= 8990) {
                        System.out.println("Вы успешно подключили базовый тариф за 8990 тг.");
                        System.out.println("Оставшийся баланс: " + (balance - 8990));
                    } else {
                        System.out.println("Недостаточно средств! Нужно 8990 тг., а у вас только " + balance);
                    }
                }

            }




      }
}