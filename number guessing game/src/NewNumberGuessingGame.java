import java.util.Scanner;

public class NewNumberGuessingGame
	{

		static String name;
		{
			System.out.println("Owen");
		}
		
		public static void main(String[] args)
			{
				greetUser();
				numberGuessing();
			}
				public static void greetUser()
					{
				Scanner userInput = new Scanner(System.in);
				System.out.println("What is your name?");
				 name = userInput.nextLine();
				System.out.println("Hello, " + name + "!");
					}
				
				public static void numberGuessing()
				{
				boolean stillGuessing = true;
				
				int game = 10; ///Change this number to change range of guessing game
				
				int secretNumber = (int) (Math.random() * game) + 1;
				
				while (stillGuessing)
				{
					Scanner userInput2 = new Scanner(System.in);
					System.out.println("Pick a number between 1 and " + game);
					int guess = userInput2.nextInt();
					
					if (guess < secretNumber)
						{
							System.out.println("That number is to low");
						}
						else if (guess > secretNumber)
						{
							System.out.println("That number is to high");
						}
						else
						{
							stillGuessing = false;
						System.out.println("Congratulations " + name + ", that is the correct number" );
						}
				}
				
				}
				
			
	}