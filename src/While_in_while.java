public class While_in_while {
    public static void main(String[] args) {
//        int like = 1;
//        System.out.println("У поста нет лайков");
//
//        while (like <= 7) {
//            if (like == 1) {
//                System.out.println("Пост понравился " + like + " человеку");
//                like +=1 ;
//
//            } else if (like <= 4) {
//                System/out/println

//         for ( int i = 5; i > 0; i--) {
//             if (i == 5) {
//                 System.out.println("Осталось " + i + " дней");
//             } else if ( i == 1) {
//                 System.out.println("Остался " + i + " день");
//             } else {
//                 System.out.println("Осталось " + i + " дня");
//             }
//
//         }
//         System.out.println("Сегодня день мероприятия!");
//
//        String name = "#";
//        for (int i = 1; i <= 5; i += 1) {
//            System.out.println(name);
//            name += "#" ;
//
//       }


//   for ( int i = 0; i <= 7; i += 1) {
//       if (i == 0) {
//           System.out.println("У поста нет лайков");
//       } else if ( i == 1) {
//           System.out.println("Пост понравился 1 человеку");
//       } else if (i <= 4) {
//           System.out.println("Пост понравился " + i + " людям");
//       } else {
//           System.out.println("Пост понравился " + i + " пользователям");
//       }

//

        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0 & i % 3 == 0) {
                System.out.println("Hello. World");
            } else if (i % 5 == 0) {
                System.out.println("World");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else {
                System.out.println(i);


            }
        }
    }
}
