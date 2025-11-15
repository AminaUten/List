public class Counter {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000, "USD");
        bankAccount.deposit(1000, "EUR");
        bankAccount.deposit(500, "RUB");

        bankAccount.withdraw(150000, "KZT");
        bankAccount.withdraw(200, "USD");

        System.out.println("Ваш баланс: " + bankAccount.balance);
    }
}

































//        Product firstProduct = new Product();
//        firstProduct.name = "iphone 12";
//        firstProduct.price = 244_990;
//
//        Product secondProduct = new Product();
//        secondProduct.name = "1 кг яблок";
//        secondProduct.price = 800;


//        bankAccount.buy(firstProduct); // 1799990 - 244990 = 1554990
//        bankAccount.buy(secondProduct); // 1799990 - 800