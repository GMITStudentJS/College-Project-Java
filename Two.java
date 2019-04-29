/*
Program Name:Two
Variables/Types: Int
Inputs: yes
If/else statements: yes
Loops: no
Loop how many times:not applicable
*/
import java.util.Scanner;

public class Two{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	int first=0;
	int second=0;

	System.out.print("Enter a number: ");
	first=input.nextInt();

	System.out.print("Enter a number: ");
	second=input.nextInt();

	if(first==2 && second==2) {
		System.out.println("Both are 2");
	}else if(first !=2 && second !=2) {
		System.out.println("Neither is 2");
	}else if(first==2 || second==2){
		if(second !=2) {
			System.out.println("First is 2");
		}else if(first !=2) {
			System.out.println("Second is 2");
		}
	}

    }
}