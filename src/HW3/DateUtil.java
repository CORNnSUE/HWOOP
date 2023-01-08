import java.util.Scanner;

public class DateUtil {

    public static final int[] NUMBERDAYSINMONTH = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
    public static final String[] MONTHS = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov",
            "Dec" };
    public static final String[] DAYS = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2011));
        System.out.println(isLeapYear(2012));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2011, 2, 29));
        System.out.println(isValidDate(2099, 12, 31));
        System.out.println(isValidDate(2099, 12, 32));

        System.out.println(getDayOfWeek(1982, 4, 24));
        System.out.println(getDayOfWeek(2000, 1, 1));
        System.out.println(getDayOfWeek(2054, 6, 19));
        System.out.println(getDayOfWeek(2012, 2, 17));

        System.out.println(toString(21, 11, 2021));

    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 1999 || year > 9999) {
            return false;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                return false;
            }
        }

        if (month == 2) {
            if (!isLeapYear(year) && day == 29) {
                return false;
            }
        }
        return true;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int a = (14 - month) / 12;
        int y = year - a;
        int m = month + 12 * a - 2;
        return (day + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;

    }

    public static String toString(int day, int month, int year) {
        String formatDay = String.valueOf(day);

        if (day < 10) {
            formatDay = "0" + day;
        }

        return DAYS[getDayOfWeek(year, month, day)] + " " + formatDay + " " + MONTHS[month - 1] + " "
                + year;
    }

}

/*
public class Matrix {
    public static void main(String[] args) {
        int [][] argMatrix = null;
        createRandomMatrix(argMatrix);
    }
    Public static void createRandomMatrix(int[][] matrix){
        matrix = new int[5][5];
        for (int row = 0; row < matrix.length; row ++){
            for (int col = 0; col < matrix[0].length;col ++ ){
                matrix[row][col] = (int)(Math.random() * (100 - 50)  * 50);
            }
        }
    }
}
*/

