public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; number++) {
            sum += number;
        }
        average = (double)sum/(UPPERBOUND-LOWERBOUND+1);
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The avegare is " + average);      
        /*
        // Try
        //1. 
        int number = LOWERBOUND;
        while (number <= UPPERBOUND) {
            sum += number;
            number++;
        }

//2. 
         int number = LOWERBOUND;
        do {
            sum += number;
            average = sum/(UPPERBOUND - LOWERBOUND +1);
            number ++;
        }
        while (number <= UPPERBOUND);
        System.out.println("The sum of 1 to 100 is " + sum);
        System.out.println("The avegare is " + average);

        
/* 3. 	khác nhau giữa for và while do
        While do : lặp với số lần chưa biết trước và trong vòng lặp while nếu quá trình khởi tạo được thực hiện trong quá trình kiểm tra điều kiện, thì việc khởi tạo được thực hiện mỗi lần lặp vòng lặp.
        For : lặp với số lần đã biết trước và trong vòng lặp 'for', quá trình khởi tạo sau khi hoàn tất sẽ không bao giờ lặp lại
        	
			khác nhau giữa while do và do while
        while do : 1.Các lần lặp không xảy ra nếu, điều kiện ở lần lặp đầu tiên, xuất hiện sai
        	       2. điều kiện điều khiển xuất hiện ở đầu vòng lặp
        do while : 1. Lặp lại xảy ra ít nhất một lần ngay cả khi điều kiện là sai ở lần lặp đầu tiên
                   2. điều kiện điều khiển xuất hiện ở cuối vòng lặp.
        */

//4.
        int sum_4 = 0;
        int count = 0;
        for (int i = 111; i <= 8899; i++) {
            sum += i;
            count++;
        }
        double avegare_4 = (double)sum/count;
        System.out.println("The sum of 111 to 8899 is " + sum);
        System.out.println("The avegare is " + avegare_4);

//5. 
        for (int i = 1; i <= 100; i++) {
            sum += i*i;
        }
        
//6 
        int sumOdd = 0;
        int sumEven = 0;
        int absDiff;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }

        //Compute Absolute difference
        if (sumOdd > sumEven) {
            absDiff = sumOdd - sumEven;
        } else {
            absDiff = sumEven - sumOdd;
        }

        // OR use one liner conditional expression
        absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;

       
    }
}




