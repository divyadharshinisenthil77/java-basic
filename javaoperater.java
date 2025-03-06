 //import java.util.*;

/**class arithmeticoperator{
    public static void main(String [] args){

    Scanner obj = new Scanner(System.in);
    
    
    System.out.println("enter the number1: ");
    int num1 = obj.nextInt();
    System.out.println("enter the number2");
    int num2 = obj.nextInt();
    System.out.println("the value is" + (num1+num2));
    System.out.println("tne value is" + (num1-num2));
    System.out.println("the value is" + (num1*num2));
    System.out.println("the value is" + (num1/num2));
    System.out.println("the value is" +(num1%num2));
 
}

}*/

//import java.util.*;
/**class logicaloperator{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
         System.out.println("enter the number1");
         int num1 = obj.nextInt();
         
         if(num1%3==0 && num1%5==0)
         {
            System.out.println("it is divisible");
         
         }
         else 
         {
            System.out.println("not divisible");
         }
    }
}*/

//import java.util.*;

/**class bitwise{
    public static void main(String [] args){

    Scanner obj = new Scanner(System.in);
    
    
    System.out.println("enter the number1: ");
    int num1 = obj.nextInt();
    System.out.println("enter the number2");
    int num2 = obj.nextInt();
    System.out.println("the value is" + (num1 & num2));
    System.out.println("tne value is" + (num1 | num2));
    System.out.println("the value is" + (num1 ^ num2));
    System.out.println("the value is" + (num1 << num2));
    System.out.println("the value is" +(num1 >> num2));
 
}

}*/

//import java.util.*;
/*class assignmentoperator{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
         System.out.println("enter the number1");
         int num1 = obj.nextInt();
         System.out.println("enter the number2");
         int num2 = obj.nextInt();
         System.out.println("the result is" +(num2 += num1));
         System.out.println("the result is" +(num2 -= num1));
         System.out.println("the result is" +(num2 *= num1));
         System.out.println("the result is" +(num2 /= num1));
         System.out.println("the result is" +(num2 %= num1));

         
    }
}*/

//import java.util.*;
/**class ifelse{
public static void main(String [] args){
    Scanner obj = new Scanner(System.in);
    System.out.println("enter the number");
    int num = obj.nextInt();
    if(num > 0)
    {
        System.out.println("num is positive");
    }
    else if(num < 0)
    {
        System.out.println("num is negative");
    }
    else
    {
        System.out.println("num is zero");
    }

}
}*/

//import java.util.*;
/**class vote{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the age");
        int age = obj.nextInt();
        if(age >= 18)
        {
            System.out.println("eligible to vote");


        }
        else
        {
            System.out.println("not eligible to vote");
        }
    }
}*/

//import java.util.*;
/**class grade{
    public static void main(String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the mark");
        int mark = obj.nextInt();
        if(mark >= 90 && mark <= 100 )
        {
            System.out.println("A GRADE");
        }
        else if(mark >= 80 && mark <= 89)
        {
            System.out.println("B GRADE");
        }
        else if(mark >= 70 && mark <= 79)
        {
            System.out.println("C GRADE");
        }
        else if(mark >= 60 && mark <= 68)
        {
            System.out.println("D GRADE");
        }
        else 
        {
            System.out.println("FAIL");
        }




    }

    }*/

   //import java.util.*;
/**class switchcase{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the week number");
        int num = obj.nextInt();
        switch(num){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4:
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            

        }
    }
}*/

//import java.util.*;

/**class leapyear{

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = obj.nextInt();

        
        if (year % 4 == 0) {
            
            if (year % 100 != 0) {
                
                if (year % 400 == 0) {

                    System.out.println(year + " is a leap year.");
                } else {
                    
                    System.out.println(year + " is not a leap year.");
                }
            } else{
                System.out.println(year + " is a leap year.");
            }
        }   else {
            
            System.out.println(year + " is not a leap year.");
        }

    
        
    }
}*/