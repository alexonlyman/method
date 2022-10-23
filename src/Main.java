public class Main {
    public static int checkYear (int year) {
        int years = year % 4;
        return years;

    }

    public static void main(String[] args) {
        int year = 2022;
        if (checkYear(year) == 0)
            System.out.println(" високосный ");
        else System.out.println(" не високосный ");
        int specialYear = checkYear(year);

    }
}
