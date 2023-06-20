package javaProject;
import java.util.Scanner;
import java.util.Random; 

public class NumberGuessing {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int max = 100;
		int min = 1;
		Random randomNum = new Random();
		int num = min + randomNum.nextInt(max);
		int k = 1;
		while (k<=10) {
	    System.out.println("Enter your guessing number between 1-100:");
	    int a = sc.nextInt();
	    k++;
	    if(a>num) {
	    	System.out.println("Your guess is higher !");
	    	
	    }
	    else if (a<num) {
	    	System.out.println("Your guess is lower !");
	    }
	    else {
	    	System.out.println("Congrats ! Your Guessing is Correct !!\n"+"Your scores are:"+k);
	    	break;
	    }
		if(k==11)
		System.out.println(" OOPS! Your Tries are Finished !");
		}
	}
}

	


