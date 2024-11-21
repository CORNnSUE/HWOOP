package ex13;

public class TestMain {
    public static void main(String[] args) {

        MyDate date = new MyDate(1, 12, 2012);
        System.out.println(date);

        System.out.println("day: " + date.getDay());
        System.out.println("month: " + date.getMonth());
        System.out.println("year: " + date.getYear());

        date.setDate(29, 2, 2012);
        System.out.println(date);
        date.setDay(1);
        System.out.println(date);
        date.setMonth(7);
        System.out.println(date);
        date.setYear(2002);
        System.out.println(date);

        date.previousMonth();
        System.out.println("Previous Month: " + date);
        date.nextMonth();
        System.out.println("Next Month: " + date);
        date.previousDay();
        System.out.println("Previous Day: " + date);
        date.nextDay();
        System.out.println("Next Day" + date);
        date.previousYear();
        System.out.println("Previous Year: " + date);
        date.nextYear();
        System.out.println("Next Year: " + date);



    }

}

