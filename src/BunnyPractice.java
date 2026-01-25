import java.util.List;
public class BunnyPractice {
    public static void main(String[] args) {
        List<MountainHare> hares = List.of(
                new MountainHare(4, 4.4, 120),
                new MountainHare(7, 3.6, 150),
                new MountainHare(1, 2.3, 100)
        );

        System.out.println("В лесу лето!");
        System.out.println("Летний лес с зайцами!");
        Forest forest = new Forest(hares);
        Forest.setSeason("лето");
        // создайте объект "летний лес с зайцами"

        System.out.println("Список зайцев:");
        forest.printHares();

        System.out.println("В лесу зима!");
        Forest.setSeason("зима");

        System.out.println("Список зайцев:");
        forest.printHares();
    }

}
