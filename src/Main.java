import java.time.LocalDate;

public class Main {
    public static int checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
        //(currentYear % 4 == 0 && currentYear % 100 != 0) || currentYear % 400 == 0
        return year;
    }

    public static int changeOs(String name, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year < currentYear) {
            System.out.println("обновите версию");
        } else {
            System.out.println("установите текущую версию");
        }
        if (name.equals("IOS")) {
            System.out.println("IOS");

        } else {
            System.out.println("ANDROID");
        }


        return currentYear;
    }

    public static int deliverToclient(int distance) {
        int day = 1;
        if (distance > 20) {
            day++;
        }

        if (distance > 60) {
            day++;
        }
        return day;
    }


    public static void main(String[] args) {
        int year = 2020;
        if (checkYear(year) == 0) System.out.println("високосный ");
        else System.out.println(" не високосный ");
        int specialYear = checkYear(year);

        System.out.println(" задача 2 ");

        String nameOs = "IOS";
        int osYear = 2020;
        int clientOs = changeOs(nameOs, osYear);

        System.out.println(" задача 3 ");
        int deliveryDistance = 80;
        int deliveryDays = 1;
        deliveryDays = deliverToclient(deliveryDistance);
        System.out.println("потребуется дней " + deliveryDays);








    }


}



