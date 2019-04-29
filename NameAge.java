/*
Program Name:NameAge
Variables/Types: int,String
Inputs: yes
If/else statements:no
Loops: yes
Loop how many times:unknown
*/

import java.util.Scanner;

public class NameAge{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	String name="";
	int age=0;
	int count=1;

	System.out.print("Enter your name: ");
	name=input.nextLine();

	System.out.print("Enter your age: ");
	age=input.nextInt();

	while(count<=age) {
		System.out.println(name);
		count++;
	}

    }
}