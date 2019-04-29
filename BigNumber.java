/*
Program Name:BigNumber
Variables/Types: int
Inputs: yes
If/else statements: yes
Loops:no
Loop how many times: not applicable
*/
import java.util.Scanner;

public class BigNumber{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	int number=0;

	System.out.print("Enter a number: ");
	number=input.nextInt();

	if(number>1000000) {
		System.out.println("That is a big number.");
	}

    }
}