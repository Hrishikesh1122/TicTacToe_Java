package game;
import java.util.Scanner;
public class TicTacToe {
	static char[] board= new char[10];
	static char playerSymbol;
	static char cpuSymbol;
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
		sc.close();
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
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		createBoard();
	    chooseSymbol();
		

	}

}
