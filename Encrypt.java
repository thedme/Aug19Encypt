package com.assinmentencrypt;
import java.util.Scanner;

public class Encrypt {
	static Scanner sc = new Scanner(System.in);
	static boolean stop = true;
	static String yesOrNo;
public static void main(String[] args) {
	
	
	do {
		System.out.println("Please enter message ");
		//System.out.println("Please do not enter special characters or spaces");
		
		String userSentence = sc.nextLine();
		Encrypt a = new Encrypt();
		System.out.println(a.encode(userSentence, 1));
		
		System.out.println(" ");
		
		System.out.println(a.decrypt(userSentence));
		a.stopCode(yesOrNo);
	} while (stop);

	
}
	public  String encode(String userSentence, int shift){
		
		
        userSentence = userSentence.toLowerCase();
       // userSentence = userSentence.toString();
       // userSentence.split("[a-z]");
		char letter;
		
		int shifted;
        String encode = "this is your encrypted message: \n";
        for(int i = 0; i< userSentence.length(); i++){
            letter = userSentence.charAt(i);
            if(letter == ' ')
            {
            	shifted = (int)letter;
            }
            else
            {
            shifted = (int)letter + shift;
            }
            
            letter = (char)shifted;
            encode = encode + letter;
        }
		return encode;


	}
	
	public void stopCode(String yesOrNo){
		System.out.println("\nWould you like to encrypt again?");
		System.out.println("Enter yes or no.");
		
		yesOrNo = sc.nextLine();
		if(yesOrNo.toLowerCase().equals("yes"))
		{
			stop = true;
		}else if(yesOrNo.toLowerCase().equals("no"))
		{
			stop = false;
			System.out.println("Good Bye!");
		}else
		{
			System.out.println("Your input was not recognized, so we will exit");
			stop = false;
		}
		//return null;
		
		
		//return stop;
		
	}
	
	public String decrypt(String userSentence)
	{
		System.out.println("This is the decrpted message");
		return userSentence;
		
	}
	
	
}