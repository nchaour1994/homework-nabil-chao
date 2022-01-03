package homework2.shuffleGame;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class SuffleGame {
	

	public static void main(String[] args) {
		Shuffle shuffle = new Shuffle();
		int []arrayGame= {1,0,1};
		int answer ;// choose 1or 2 or 3 
		int pickUpAnswer; // choose a position in the array 
		char playTheGame;// yes or no char 
		Scanner sc = new Scanner(System.in);
		do {
	System.out.println("-----------welcome to shuffle game ----------------");
	System.out.println("geuss where is the 0, please enter 1 or 2 or 3  ");
	while(!sc.hasNextInt()) {
		System.out.println("please enter an integer ");
		sc.next();
	}
	answer= sc.nextInt();//read the asnwer 
	
	System.out.println(answer);
	//check if its a good answer 
	
	while(answer != 1 &&answer != 2 && answer != 3) {
		System.out.println("please enter a valid number ");
		
		answer= sc.nextInt();
		
		if(answer == 1 ||answer == 2 || answer == 3) {
			break;
		}
		
	}
	
	//if the user enter a correct answer 
	System.out.println("are you ready to play ? y/n");
	playTheGame= sc.next().charAt(0);
	//check if its yes or no
	while(playTheGame!='y' && playTheGame!='n') {
		System.out.println("please enter a valid answer y for yes n for no  ");
		playTheGame= sc.next().charAt(0);
		if (playTheGame== 'y'||playTheGame=='n') {
			break;
		}
		
	}
	
	if (playTheGame== 'y') {
		
		shuffle.shuffleArray(arrayGame);
		System.out.println("pick up 1 or 2 or 3 ");
		while(!sc.hasNextInt()) {
			System.out.println("please enter an integer ");
			sc.next();
		}
		pickUpAnswer=sc.nextInt();//pick up a position in the array 
		//check if its a good answer 
		while(pickUpAnswer != 1 &&pickUpAnswer != 2 && pickUpAnswer != 3) {
			System.out.println("please enter a valid number ");
			pickUpAnswer= sc.nextInt();
			if(pickUpAnswer == 1 ||pickUpAnswer == 2 || pickUpAnswer == 3) {
				break;
			}
			
		}
		// compare if the answer of the user equal the position in the array 
		// i use -1 to not exceed the length of the array 
		if (arrayGame[answer-1]==0 && arrayGame[answer] == arrayGame[pickUpAnswer-1] ) {
			System.out.println("good guess ");
			
		}else
			System.out.println("try again ");
		
	    } 
	System.out.println("do you want to play again y/n");
	playTheGame=sc.next().charAt(0);
	
	
	
	}while(playTheGame== 'y');
		System.out.println("---------------thank you----------------------- ");
	
		

	}

}
