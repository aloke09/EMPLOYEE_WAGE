package emp_wage2;

import java.util.Random;

public class empWage
{
    public static void main(String[] args) {

        int FULL_TIME=1;

        Random r=new Random();

        int Check=r.nextInt(0,2);

        if(Check==FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }
    }
}
