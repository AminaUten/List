
import java.util.Scanner;



public class massive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] drinks = {"Капучино", "Раф", "Американо", "Латте", "Флэт Уайт", "Матча"};
        int[] countDrinks = new int[drinks.length];

        for (int i = 0; i < drinks.length; i++) {
            System.out.println(i + 1 + ". " + drinks[i]);
        }
        System.out.println("0. Завершить");

        int choice = input.nextInt();
        if (choice > 0 && choice < drinks.length + 1) {
            System.out.println(drinks[choice - 1] + " готовится, ожидайте...");
            countDrinks[choice - 1]++;
        } else if (choice == 0) {
            System.out.println("Вы вышли из меню напитков");
            System.out.println(" == Чек == ");
            for (int i = 0; i < countDrinks.length; i++) {
                if ((countDrinks[i] > 0)) {
                    System.out.println(drinks[i] + " х " + countDrinks[i]);


                }

            }
        }
    }
}
