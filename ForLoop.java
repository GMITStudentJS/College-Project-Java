/*
Program Name:ForLoop
Variables/Types: int
Inputs: yes
If/else statements: yes
Loops: yes
Loop how many times: fixed
*/

import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
	Scanner input=new Scanner(System.in);

	int one=0;
	int two=0;
	int three=0;
	int four=0;
	int five=0;
	int six=0;
	int seven=0;
	int eight=0;
	int nine=0;
	int ten=0;


	for(int count=1; count<=10; count++) {
		System.out.print("Enter number "+count+": ");

		if(count==1) {
			one=input.nextInt();
		}else if(count==2) {
			two=input.nextInt();
		}else if(count==3) {
			three=input.nextInt();
		}else if(count==4) {
			four=input.nextInt();
		}else if(count==5) {
			five=input.nextInt();
		}else if(count==6) {
			six=input.nextInt();
		}else if(count==7) {
			seven=input.nextInt();
		}else if(count==8) {
			eight=input.nextInt();
		}else if(count==9) {
			nine=input.nextInt();
		}else if(count==10) {
			ten=input.nextInt();
		}
	}


		int odd=0;

		if(one%2!=0){
			odd=odd+one;
		}if(two%2!=0){
			odd=odd+two;
		}if(three%2!=0){
			odd=odd+three;
		}if(four%2!=0){
			odd=odd+four;
		}if(five%2!=0){
			odd=odd+five;
		}if(six%2!=0){
			odd=odd+six;
		}if(seven%2!=0){
			odd=odd+seven;
		}if(eight%2!=0){
			odd=odd+eight;
		}if(nine%2!=0){
			odd=odd+nine;
		}if(ten%2!=0){
			odd=odd+ten;
		}

		System.out.println();
		System.out.println("Sum of odd numbers is "+odd);
    }
}