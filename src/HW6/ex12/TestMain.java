package HW6.ex12;


public class TestMain {
    public static void main(String[] args) {

        MyTime myTime = new MyTime(3, 10, 10);
        System.out.println(myTime);

        System.out.println("Hour: " + myTime.getHour());
        System.out.println("Minute: " + myTime.getMinute());
        System.out.println("Second: " + myTime.getSecond());

        //set1
        myTime.setHour(2);
        myTime.setMinute(14);
        myTime.setSecond(1);
        System.out.println("Set Time: " + myTime);

        //set2
        myTime.setTime(1, 4, 12);
        System.out.println("Set Time: " + myTime);

        myTime.nextMinute();
        System.out.println("Next Minute: " + myTime);
        myTime.nextSecond();
        System.out.println("Next Second: " + myTime);
        myTime.nextHour();
        System.out.println("Next Hour: " + myTime);

        myTime.previousHour();
        System.out.println("Previous Hour: " + myTime);
        myTime.previousMinute();
        System.out.println("Previous Minute: " + myTime);
        myTime.previousSecond();
        System.out.println("Previous Second: " + myTime);

    }

}

