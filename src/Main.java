public class Main {

    public static void main(String[] args) {


        {// Задание 1
            System.out.println(" Задание 1");

            int age = 21;
            if (age >= 18) ;

            System.out.println("Поздравляем, Вас с совершеннолетием!");
            {
                int age2 = 17;
            }
            if (age < 18) ;

            System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать!");
            // Задание 2
            System.out.println(" Задание 2");
            int age3 = 10;

            if (age3 >= 7 && age3 < 18)
                System.out.println(" Ребёнок ходит в школу");
            int age4 = 22;

            if (age4 >= 18 && age4 < 24)
                System.out.println(" Человек ходит в университет");
            int age5 = 27;
            if (age5 >= 24)
                System.out.println(" Человек ходит на работу");
            // Задание 3
            System.out.println(" Задание 3");
            int capacity = 102;
            int seatsCount = 60;
            int standingCount = capacity - seatsCount;
            int seatsUsed = 15;
            int standingUsed = 28;
            if (seatsUsed < seatsCount) {
                System.out.println(" Есть ещё " + (seatsCount - seatsUsed) + " сидячих мест ");
            }
            if (seatsUsed == seatsCount) {
                System.out.println(" Сидячих мест нет !");
            }
            if (standingUsed < standingCount) {
                System.out.println(" Есть ещё " + (standingCount - standingUsed) + " стоячих мест");
            }
            if (standingUsed == standingCount) {
                System.out.println(" Стоячих мест нет !");
            }
            // Задание1.2
            System.out.println(" Задание1.2 ");
            int age0 = 15;
            if (age0 >= 18) {
                System.out.println("Поздравляем, Вас с совершеннолетием!");
            }else {
                System.out.println("Возраст совершеннолетия еще не наступил, нужно подождать!");
            }
            // Задание 2.2
            System.out.println(" Задание 2.2");
            int age03 = 10;
            if (age03 >= 7 && age3 < 18) {
                System.out.println(" Ребёнок ходит в школу");
            } else if (age03 >= 18 && age03 < 24) {
                System.out.println(" Человек ходит в университет");
            }else if  (age03 >= 24) {
                System.out.println(" Человек ходит на работу");
            }
            // Задание 3.2
            System.out.println(" Задание 3.2");
            int capacity0 = 102;
            int seatsCount0 = 60;
            int standingCount0 = capacity0 - seatsCount0;
            int seatsUsed0= 60;
            int standingUsed0 = 42;
            if (seatsUsed0 < seatsCount0) {
                System.out.println(" Есть ещё " + (seatsCount0 - seatsUsed0) + " сидячих мест ");
            }
            else {
                System.out.println(" Сидячих мест нет !");
            }
            if (standingUsed0 < standingCount0) {
                System.out.println(" Есть ещё " + (standingCount0 - standingUsed0) + " стоячих мест");
            }
            else  {
                System.out.println(" Стоячих мест нет !");
            }
            // Задача 1.3
            System.out.println(" Задача 1.3 ");
            if (age >= 2 && age <= 6) {
                System.out.println(" Если возраст человека равен " +age + ", то ему нужно ходить в детский сад " );
            }else if ( age > 6 && age <= 18){
                System.out.println( " Если возраст человека равен " +age + ", то ему нужно ходить в школу ");
            }else if ( age > 18 && age <= 24){
                System.out.println( " Если возраст человека равен " +age + ", то ему нужно ходить в университет ");
            }else if ( age < 24){
                System.out.println( " Если возраст человека равен " +age + ", то ему нужно ходить на работу ");
            }
            // Задача 2.3
            System.out.println(" Задача 2.3 ");
            if (age < 5) {
                System.out.println(" Ребёнок не может кататься на аттракционе ");
            } else if (age < 14) {
                System.out.println(" Ребёнок может кататься на аттракционе только в сопровождении взрослого ");
            }else {
                System.out.println(" Ребёнок может кататься на аттракционе ");

                // Задача 3.3
                System.out.println(" Задача 3.3 ");
                int one = 900;
                int two = 74;
                int three = 15;
                if ( one > two) {
                    if (one >= three) {
                        System.out.println(" Максимальное число - " + one );
                    } else {
                        System.out.println(" Максимальное число - " + three );
                    }
                } else if (two > one) {
                    if (two >= three) {
                        System.out.println(" Максимальное число - " + two );
                    } else {
                        System.out.println(" Максимальное число - " + three );
                    }
                } else {
                    if (one > three ) {
                        System.out.println(" Максимальное число - " + one );
                    } else if (three > one ) {
                        System.out.println(" Максимальное число - " + three );
                    } else {
                        System.out.println(" Все три числа равны ");
                            }
                    }
                }
            }







        }





            }
