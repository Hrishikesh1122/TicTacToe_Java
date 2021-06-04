package game;
import java.util.*;
public class TicTacToe {
	static char[] board= new char[10];
	static char playerSymbol;
	static char cpuSymbol;
	static int position;
    static int userMove;
	/**
	 * UC1 : Creating board for tic tac toe 
	 * initializing elements to ' '
	 */
	public static void createBoard() {
		        for (int i=1;i<board.length;i++)
		        {
		        	board[i]=' ';
		        }
	}
	/**
	 * Assigns symbol to user of their choice
	 * Assigns the other symbol to computer
	 */
	public static void chooseSymbol() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your symbol X or O");
		char symbol=sc.next().charAt(0);
		if(symbol=='X'||symbol=='x') {
			playerSymbol='X';
			cpuSymbol='O';		
		}
		else if(symbol=='O'||symbol=='o')
		{
			playerSymbol='O';
			cpuSymbol='X';
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}
	public static void showBoard() {
		for(int i=1;i<board.length;i++)
		{
			board[i]=(char) i;
		}
		 System.out.println("|---|---|---|");
	     System.out.println("| " + (int)board[1] + " | " + (int)board[2] + " | " + (int)board[3] + " |");
	     System.out.println("|-----------|");
	     System.out.println("| " + (int)board[4] + " | "+ (int)board[5] + " | " + (int)board[6] + " |");
	     System.out.println("|-----------|");
	     System.out.println("| " + (int)board[7] + " | " +  (int)board[8] + " | " + (int)board[9] + " |");
	     System.out.println("|---|---|---|");		

	}
	/**
	 * Accepts move of the user
	 */
	public static void getMove() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your move ");
	    userMove = sc.nextInt();
	}

	
	

	public static void main(String[] args) {
		createBoard();
	    chooseSymbol();
	    showBoard();
		getMove();

	}

}
