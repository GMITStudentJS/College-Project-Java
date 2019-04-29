/*
Program Name:Number
Variables/Types: int
Inputs: yes
If/else statements: yes
Loops: no
Loop how many times: not applicable
*/
import java.util.Scanner;

public class Number{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	int number = 0;

	System.out.print("Enter a number: ");
	number=input.nextInt();

	if(number>0){
		System.out.println("This number is positive.");
	}else if(number<0){
		System.out.println("This number is negative.");
	}else{
		System.out.println("This number is Zero.");
	}

    }
}
