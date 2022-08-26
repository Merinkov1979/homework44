public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println(" Установите версию приложения для iOS по ссылке ");
        } else {
            System.out.println(" Установите версию приложения для android по ссылке");

        }


        int clientDeviceYea = 2015;
        int ios = 0;
        if (clientDeviceYea < 2015 && ios == 0) {
            System.out.println(" Установите облегченную версию приложения для iOS по ссылке ");
        } else {
            System.out.println(" приложение на ios будет работать корректно ");
            int android = 1;
            if (clientDeviceYea < 2015 && android == 1) {
                System.out.println(" Установите облегченную версию приложения для Android по ссылке ");
            } else {
                System.out.println(" приложение на android будет работать корректно");
            }
        }


        int year = 2020;
        if (year % 400 == 0 || year % 4 == 0) {
            System.out.println("год является высокосным ");
        } else if (year % 100 != 0) {
            System.out.println(" год не является высокостным ");
        }


        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println(" срок доставки 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println(" срок доставки 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println(" срок доставки 3 дня");




        int monthNumber = 12;
        switch ( monthNumber ) {
            case 1:
            case 2:
                System.out.println( " Зима" );
                break;
            case 3:
            case 4:
            case 5:
                System.out.println( " Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println( "Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println( "Осень");
                break;
            case 12:
                System.out.println( "Зима");
                break;
            default:
                System.out.println( "Такого месяца не существует");
        }
        }
    }
}

























