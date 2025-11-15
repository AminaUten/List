

//public class Methods {
//    public static void main(String[] args) {
//         formatFriendsCount(1);
//    }
//    public static void formatFriendsCount (int name) {
//        if (name == 0 || name > 4) {
//        System.out.println("У вас "+ name + " друзей");
//        } else if (name == 1) {
//            System.out.println("У вас "+ name + " друг");
//        } else {
//            System.out.println("У вас " + name + " друга");
//        }
//
//  }
//
//public class Methods {
//    public static void main(String[] args) {
//        showInfo("Амина","Утен",14);
//
//    }
//    public static void showInfo(String name, String lastName, int age) {
//        System.out.println("Имя: " + name );
//        System.out.println("Фамилия: " + lastName );
//        System.out.println("Возраст: " + age );


//public class Methods {
//    public static void main(String[] args) {
//        String[] firstWeek = { "Солнечно" , "Пасмурно", "Солнечно" ,"Солнечно", "Дождливо", "Пасмурно"};
//        countSunnyDays(firstWeek);
//        String[] secondWeek = { "Солнечно" , "Солнечно", "Солнечно", "Солнечно", "Пасмурно", "Солнечно"};
//        countSunnyDays(secondWeek);
//    }
//
//    public static void countSunnyDays(String[] firstWeek) {
//        int count = 0;
//        for (int i = 0; i < firstWeek.length; i++)  {
//            if (firstWeek[i].equals("Солнечно"))  {
//            count++;
//            }
//        }  System.out.println("Количество солнечных дней: " + count);
//    }


//    public static void main(String[] args) {
//        System.out.println("Май 2022");
//        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
//        comfortCount(may2022);
//        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
//    }
//
//    public static void comfortCount(int[] may2022) {
//        int count = 0;
//        for (int i = 0; i < may2022.length; i++) {
//            if ((may2022[i] >= 20) && (may2022[i] <= 22)) {
//                count++;
//            }
//        }
//        System.out.println("Количество дней с теплой температурой(от 20 - 22):" + count);
//    }
//}

//    public static void average(int[] may2022) {
//        int average = 0;
//        for (int i = 0; i < may2022.length; i++) {
//                average = may2022[i]);
//
//        }
//        System.out.println("Средняя температура: " + average);
//    }
//
//


//    public static void main(String[] args) {
//        System.out.println("Май 2022");
//        int[] may2022 = {26, 19, 13, 17, 20, 24, 12, 17, 21, 19, 20, 23, 26, 25, 24, 27, 26, 18, 20, 25, 31, 20, 22, 28, 30, 34, 31, 16, 27, 30, 24};
//        comfortCount(may2022);
//        System.out.println("Май 2023");
//        int[] may2023 = {12, 12, 15, 17, 22, 25, 27, 29, 21, 24, 27, 21, 25, 13, 20, 23, 24, 12, 19, 23, 24, 26, 24, 25, 27, 22, 23, 23, 29, 33, 33};
//        comfortCount(may2023);
//    }
//
//    public static void comfortCount(int[] month) {
//        int count = 0;
//        double average = 0;
//        int maxTemperature = month[0];
//        int minTemperature = month[0];
//        int minDay = 1600;
//        int maxDay = 1700;
//        for (int i = 0; i < month.length; i++) {
//            average += month[i];
//            if (month[i] < minTemperature) {
//                minTemperature = month[i];
//                minDay = i + 1;
//            }
//            if (month[i] > maxTemperature) {
//                maxTemperature = month[i];
//                maxDay = i + 1;
//            }
//
//            if ((month[i] >= 20) && (month[i] <= 22)) {
//                count++;
//            }
//        } average = average / month.length;
//        System.out.println("Количество дней с комфортной температурой(от 20 - 22):" + count);
//        System.out.println("Средняя температура: " + average);
//        System.out.println("Самая низкая температура в месяце была " + minDay + " числа: " + minTemperature + " градусов");
//        System.out.println("Самая высокая температура в месяце была " + maxDay + " числа: " + maxTemperature + " градусов");
//
//    }
//}

//    public static void main(String[] args) {
//        int[] radioHead = {1993, 1995, 1997, 2000, 2001, 2003, 2007, 2011, 2016};
//        intervalsBetweenSongs(radioHead);
//        int[] kendrickLamar = {2011, 2012, 2015, 2016, 2017, 2022, 2024};
//        intervalsBetweenSongs(kendrickLamar);
//        int[] bjork = {1977, 1990, 1993, 1995, 1997, 2001, 2004, 2007, 2011, 2015, 2017, 2022};
//        intervalsBetweenSongs(bjork);
//    }
//
//    public static void intervalsBetweenSongs(int[] song) {
//        int[] interval = new int[song.length];
//        int maxYear = 0;
//        String symbolsOfSongs = "*";
//        for (int i = 1 ; i < song.length - 1; i++) {
//            interval[i] = song[i] - song[i-1];
//            if (interval[i] > interval[i+1]) {
//                maxYear = interval[i];
//            }
//
//        }
//        System.out.println("Интервалы между выпусками альбомов в годах: " + Arrays.toString(interval));
//        System.out.println("Самый продолжительный период без альбомов: " + maxYear);
//
//
//    }
//


public class Methods {
    public static void main(String[] args) {
        String model = "Премиум";
        int days = 20;
        String region = "Город";
        double tax = calculateTax(region) * calculateRentalPrice(model, days);
        double total = processRentalOrder(days, model) + tax;
        System.out.println("Ваша модель: " + model);
        System.out.println("Количество дней аренды: " + days);
        System.out.println("Стоимость аренды, не считая налога и скидки: " + calculateRentalPrice(model, days));
        System.out.println("Стоимость доставки: " + calculateDeliveryCost(region));
        System.out.println("Сумма налога: " + tax);
        System.out.println("Итоговая стоимость доставки аренды машины: " + total);

    }

    public static int calculateRentalPrice(String model, int days) {
        if (model.equals("Эконом")) {
            return 10_000 * days;
        } else if (model.equals("Бизнес")) {
            return 20_000 * days;
        }
        return 50_000 * days;
    }

    public static double calculateDeliveryCost(String region) {
        if (region.equals("Город")) {
            return 0;
        } else if (region.equals("Ближний регион")) {
            return 5_000;
        }
        return 10_000;
    }

    public static double calculateTax(String region) {
        if (region.equals("Город")) {
            return 0.12;
        } else if (region.equals("Ближний регион")) {
            return 0.1;
        }
        return 0.08;

    }

    public static double processRentalOrder(int days, String model) {
        if (days >= 7 && days <= 14) {
            return 0.95 * calculateRentalPrice(model, days);
        } else if (days > 14) {
            return 0.9 * calculateRentalPrice(model, days);
        }
        return calculateRentalPrice(model, days);


    }

}












































