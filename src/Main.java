import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    public static void task1() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ведите операционную сисиему Вашего устройства: где 0 - iOS и 1 - Android ");
            int clientOs = scanner.nextInt();
            if (clientOs == 0) {
                System.out.println(" Установите версию приложения для iOS по ссылке");
            } else if (clientOs == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (clientOs != 0 && clientOs != 1) {
                System.out.println(" Неизвестное устройство, обратитесь к администратору");
            }
        }
    }

    public static void task2() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ведите операционную сисиему Вашего устройства: где 0 - iOS и 1 - Android ");
            int clientOs = scanner.nextInt();                      // запрос данных с клавиатуры
            System.out.println("Введите год выпуска Вашего устройства: ");
            int clientDeviceYear = scanner.nextInt();              // запрос данных с клавиатуры
            if (clientOs == 0 && clientDeviceYear >= 2015) {
                System.out.println(" Установите версию приложения для iOS по ссылке");
            } else if (clientOs == 0 && clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для iOS по ссылке");
            }
            if (clientOs == 1 && clientDeviceYear >= 2015) {
                System.out.println(" Установите версию приложения для Android по ссылке");
            } else if (clientOs == 1 && clientDeviceYear < 2015) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Введите чифры года: ");
            int year = scanner.nextInt();                      // запрос данных с клавиатуры
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(" Год " + year + " является високосным");
            } else {
                System.out.println(" Год " + year + " не является високосным");
            }
        }
    }

    public static void task4() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Введите расстояние в километрах от офиса банка до адреса доставки: ");
            int deliveryDistance = scanner.nextInt();                      // запрос данных с клавиатуры
            float day = deliveryDistance / 40f;        // вычисление количества дней доставки
            int totalDAy = (int) Math.round(day);              // огруглние в большую сторону результата предюдущей операции
            if (deliveryDistance <= 20) {
                System.out.println(" Доставка карты займет 1 сутки ");
            } else if (21 > deliveryDistance && deliveryDistance <= 60) {
                System.out.println(" Доставка карты займет 2 сутки ");
                System.out.println(" Доставка карты займет " + totalDAy + " дней");
                System.out.println(totalDAy);
                System.out.println(day);
            }


        }
    }

    public static void task5() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(" Введите номер месяца в году: ");
            int monthNumber = scanner.nextInt(); // запрос данных с клавиатуры
            switch (monthNumber) {
                case 1:
                    System.out.println(" Месяц январь - это зима");
                    break;
                case 2:
                    System.out.println(" Месяц февраль - это зима");
                    break;
                case 3:
                    System.out.println(" Месяц март - это весна");
                    break;
                case 4:
                    System.out.println(" Месяц апрель - это весна");
                    break;
                case 5:
                    System.out.println(" Месяц май - это весна");
                    break;
                case 6:
                    System.out.println(" Месяц июнь - это лето");
                    break;
                case 7:
                    System.out.println(" Месяц июль - это лето");
                    break;
                case 8:
                    System.out.println(" Месяц август - это лето");
                    break;
                case 9:
                    System.out.println(" Месяц сентябрь - это осень");
                    break;
                case 10:
                    System.out.println(" Месяц октябрь - это осень");
                    break;
                case 11:
                    System.out.println(" Месяц ноябрь - это зима");
                    break;
                case 12:
                    System.out.println(" Месяц декабрь - это зима");
                    break;
                default:
                    System.out.println(" Такого месяца не существует");
            }
        }

    }
}