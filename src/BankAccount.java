public class BankAccount {
    double balance;
    void deposit(double amount, String currency) {
        if (amount < 0 ) {
            System.out.println("Пополнять баланс можно только на положительную сумму");
        } else if (currency.equals("USD")) {
            amount = amount * 546.35;
            balance += amount;
        } else if (currency.equals("EUR")) {
            amount = amount * 641.63;
            balance += amount;
        } else if (currency.equals("RUB")) {
            amount = amount * 6.65;
            balance += amount;
        } else if (currency.equals("KZT")) {
            balance += amount;
        }
    }

    void withdraw (double amount, String currency) {
        if (amount < 0) {
            System.out.println("Отнимать можно только на положительную сумму");
        } if ( balance < amount) {
            System.out.println("У вас недостаточно средств");
        } else if (currency.equals("USD")) {
            amount = amount * 546.35;
            balance -= amount;
        } else if (currency.equals("EUR")) {
            amount = amount * 641.63;
            balance -= amount;
        } else if (currency.equals("RUB")) {
            amount = amount * 6.65;
            balance -= amount;
        } else if (currency.equals("KZT")) {
            balance -= amount;
        }
    }
}





























//    void buy (Product newProduct) {
//
//        if (newProduct.price <= balance) {
//            balance -= newProduct.price;
//            System.out.println("Вы приобрели " + newProduct.name );
//        } else {
//            System.out.println("У вас недостаточно средств");
//        }
//        System.out.println("Ваш баланс: " + balance );
//    }