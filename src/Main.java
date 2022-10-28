

public class Main {


    public static void printIsLeapYear(int year) {
        boolean leapYear = isLeapYear(year);
        printIsLeapYearResult(year, leapYear);
    }

    private static boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    private static void printIsLeapYearResult(int year, boolean leapYear) {
        if (leapYear) {
            System.out.println(year + " - високосный год.");
        } else {
            System.out.println(year + " - не високосный год.");
        }

    }

    public static void printTheMobileApp(int clientOs, int clientDeviceYear) {

        if (clientOs == 0 && clientDeviceYear == 2022) {
            System.out.println("Установите приложение для IOS по ссылке.");
        } else if ((clientOs == 0) && (clientDeviceYear < 2022)) {
            System.out.println("Установите lite- версию приложения для IOS по ссылке.");
        }
        if ((clientOs == 1) && (clientDeviceYear == 2022)) {
            System.out.println("Установите приложение для Android по ссылке.");
        } else if ((clientOs == 1) && (clientDeviceYear < 2022)) {
            System.out.println("Установите lite- версию приложения для Android  по ссылке.");
        }
    }


    public static void printTheTotalDeliveryDays(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + days);
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (days + 1));
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (days + 2));
        }


    }

    public static void main(String[] args) {
        System.out.println("Задача 1");
        printIsLeapYear(2021);

        System.out.println("Задача 2");
        int clientDeviceYear = 2019;
        int clientOs = 1;
        printTheMobileApp(clientOs, clientDeviceYear);

        System.out.println("Задача 3");
        int deliveryDistance = 50;
        printTheTotalDeliveryDays(deliveryDistance);


    }

}











