import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int iteration = 0;

        while (true) {
            System.out.println("1. Добавить задачу");
            System.out.println("2. Удалить задачу");
            System.out.println("3. Распечатать все задачи");
            System.out.println("4. Завершить");

            int tap = Integer.parseInt(input.nextLine());
            if (tap == 1) {
                System.out.println("Введите задачу ");
                String task = input.nextLine();
                tasks.add(task);
                iteration++;
            } else if (tap == 2) {
                for (int i = 0; i < tasks.size();i++ ) {
                    System.out.println(i+1 + "." + tasks.get(i)); }
                if (tasks.isEmpty()) {
                    System.out.println("Список пуст. Вы не сможете ничего удалить");
                } else {
                    System.out.println("Выберите задачу, которую хотите удалить");
                    int deleteTask = Integer.parseInt(input.nextLine());
                    if (deleteTask > tasks.size() || deleteTask <= 0) {
                        System.out.println("Такой задачи не существует. Повторите заново");
                    } else {
                        tasks.remove(deleteTask - 1);
                        System.out.println("Задача удалена");
                    }
                }


            } else if (tap == 3) {
                if (tasks.isEmpty()) {
                    System.out.println("Список пуст");
                } else {
                    for (int i = 0; i < tasks.size();i++ ) {
                        System.out.println(i+1 + "." + tasks.get(i));

                    }
                }

            } else if (tap == 4) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Попробуйте заново. Введена неправильная команда");
            }

        }
    }
}