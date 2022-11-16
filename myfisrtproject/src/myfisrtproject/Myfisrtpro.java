package myfisrtproject;
import java.util.Scanner;


class Entryticket{
	int ticket;
	int ticketRate()
	{
		Scanner sc =new Scanner(System.in);

	    ticket=sc.nextInt();
	    
	    return ticket;
	}
}

class Guesser{
	int guessnum;
	int guessNum()
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Host lock the number");
	    guessnum=sc.nextInt();
	    
	    return guessnum;
		
	}
		
}
class Player{
	int playersnum;
	
	int PlayerNum(int i)
	{
	
		Scanner sc =new Scanner(System.in);
		System.out.println("player"+i);
	    playersnum=sc.nextInt();
	  
		return playersnum;
		
	}
}


	class umpire{
		int fromgusser;
		int fromplayer1;
		int fromplayer2;
		int fromplayer3;
		int frombet;
		int playw1,playw2,playw3;
		int gussw;
		int entryrate;
		int i;
		
		
	void heartoffun() {
		System.out.println("enter the amount");
		Entryticket t=new Entryticket();
		entryrate=t.ticketRate();
if(entryrate>=100) {
	System.out.println("***WELCOME TO THE SHOW***");
	Guesser g1=new Guesser();
	fromgusser=g1.guessNum();
	 if(fromgusser>0&&fromgusser<10)
 {
    System.out.println(" gusser numbers  between 1 to 10 the values");
    Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	
	 fromplayer1=p1.PlayerNum(1);
	 fromplayer2=p2.PlayerNum(2);
	 fromplayer3=p3.PlayerNum(3);
		if(fromgusser==fromplayer1)
		{
			if(fromgusser==fromplayer2 && fromgusser==fromplayer3)
			{
				System.out.println("All players won the game\n!!!visit again!!!");
				
			}
			else if(fromgusser==fromplayer2 )
			{
				System.out.println("Player 1 & Player2 won\n!!!visit again!!!");
			}
			else if(fromgusser==fromplayer3)
			{
				System.out.println("Player 1 & Player3 won\n!!!visit again!!!");
			}
			else
			{
				

				System.out.println("Player 1 won the game you have another chance to play");
				
					
					Guesser g=new Guesser();
					gussw=g.guessNum();
				
				
					Player pg=new Player();
					playw1=pg.PlayerNum(1);
					if(gussw==playw1) {
				 		System.out.println("*** You won the match again***\n!!!visit again!!!");
				 	       }
					else
					{
						System.out.println("***player 1 lost the match***\n!!!visit again!!!");
					}
					
			
				
		    }
		}	
		else if(fromgusser==fromplayer2)
		{
			if(fromgusser==fromplayer3)
			{
				System.out.println("Player 2 & Player3 won\n!!!visit again!!!");
			}
			else
			{
			
					System.out.println("player 2  the match you have another chance to play");
					
						
						Guesser g=new Guesser();
						gussw=g.guessNum();
					
					
						Player pg=new Player();
						playw2=pg.PlayerNum(2);
						if(gussw==playw2) {
					 		System.out.println("*** You won the match again***\n!!!visit again!!!");
					 	       }
						else
						{
							System.out.println("player 2 lost the match***\n!!!visit again!!!");
						}
						
				
			}
		}
		else if(fromgusser==fromplayer3)
		{
			if(fromgusser==fromplayer2) {
				System.out.println("player 2&3 won the match");
			}
			else {
				System.out.println("player 3 won the match you have another chance to play");
					Guesser g=new Guesser();
					gussw=g.guessNum();
				
				
					Player pg=new Player();
					playw3=pg.PlayerNum(3);
					if(gussw==playw3) {
				 		System.out.println("*** You won the match again***\n!!!visit again!!!");
				 	       }
					else
					{
						System.out.println("player 3 lost the match\\n!!!visit again!!!");
					}
					
				}
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
 }
}
 else
	 {
		 System.out.println(" ****NOT ENOUGH MONEY ENTRY COST IS 100");
	 }
	
	}

	}
	
public class Myfisrtpro {

	public static void main(String[] args) {
		
		umpire uu=new umpire();
	     uu.heartoffun();
	
	}
}


