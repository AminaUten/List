//import java.util.Scanner;
//public class While {
//      public static void main(String[]args) {
//          Scanner scam = new Scanner(System.in);
//          for (int i = 3; i <= 15; i += 3 ) {
//               int money = 2000;
//               System.out.println("На "+ i + "-й день останется " + money + " тенге.");
//               money -= 500;
//
//          }
//          System.out.println("Денег хватит на 15 дней.");
//
//
//      }
//}

//import java.util.Scanner;
//public class While {
//    public static void main(String[]args){
//        Scanner scam = new Scanner(System.in);
//        System.out.println("Сколько дней планируете откладывать?");
//        int days = scam.nextInt();
//        System.out.println("Какую сумму планируете откладывать?");
//        int sum = scam.nextInt();
//        int amount = sum ;
//        for (int i = 1; i <= days; i+=1) {
//            System.out.println("День " + i + ". Уже " + sum + " тенге.");
//            sum += amount;
//        }
//
//        System.out.println("За " + days + " дней накопили " + sum + " тенге.");
//
//    }
//}

//import java.util.Scanner;
//public class While {
//    public static void main(String[] args) {
//        Scanner scam = new Scanner(System.in);
//        System.out.println("Сколько фильмов вы планируете посмотреть?");
//        int movies = scam.nextInt();
//        int hours = 0;
//        for (int i = 1; i <= movies; i += 1) {
//            System.out.println("Введите продолжительность № " + i + " фильма(в минутах):");
//            int time = scam.nextInt();
//            hours += time;
//        }
//        System.out.println("Общее время на просмотр " + movies + " фильмов составит часов " + hours/60) ;
//    }
//}