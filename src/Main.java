import java.time.LocalDate;

public class Main {
    public static int checkYear(int year) {
        int years = year % 4;
        return years;

    }

    public static int changeOs(String name, int year) {
        int currentYear = LocalDate.now().getYear();
        if (year<currentYear){
            System.out.println("обновите версию");
        } else {
            System.out.println("установите текущую версию");
        }
        if (name.equals("IOS")){
            System.out.println("IOS");
            return 1;
        } else {
            System.out.println("ANDROID");
        } return 0;






    }


    public static void main(String[] args) {
        int year = 2020;
        if (checkYear(year) == 0) System.out.println(" високосный ");
        else System.out.println(" не високосный ");
        int specialYear = checkYear(year);

        System.out.println(" задача 2 ");

        String nameOs = "ANDROID";
        int osYear = 2022;
        int clientOs = changeOs(nameOs,osYear);








    }


}



