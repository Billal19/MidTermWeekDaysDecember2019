package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {

   ArithmeticOperator.Addition();
   ArithmeticOperator.Subtraction();
   ArithmeticOperator.Multiplication();
   ArithmeticOperator.Devision();


    }

    public static void Addition (){

        Scanner Input= new Scanner(System.in);
        System.out.println("Enter the number A;");
        int A = Input.nextInt();
        System.out.println("Enter the number B;");
        int B = Input.nextInt();

        int C = A + B ;

        System.out.println("the total is :" +C);

        System.out.println("******************************************************************************");
    }

    public static void Subtraction (){

        Scanner Input= new Scanner(System.in);
        System.out.println("Enter the number A;");
        int A = Input.nextInt();
        System.out.println("Enter the number B;");
        int B = Input.nextInt();

        int C = A - B ;

        System.out.println("the total is :" +C);


        System.out.println("*****************************************************************************");
    }



    public static void Multiplication () {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number A;");
        int A = Input.nextInt();
        System.out.println("Enter the number B;");
        int B = Input.nextInt();

        int C = A * B;

        System.out.println("the total is :" + C);


        System.out.println("*****************************************************************************");


    }

    public static void Devision () {

        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the number A;");
        int A = Input.nextInt();
        System.out.println("Enter the number B;");
        int B = Input.nextInt();

        int C = A / B;

        System.out.println("the total is :" + C);


    }



}
