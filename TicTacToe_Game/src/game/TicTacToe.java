package game;
import java.util.Scanner;
public class TicTacToe {
	static char[] board= new char[10];
	public static void createBoard() {
		        for (int i=1;i<board.length;i++)
		        {
		        	board[i]=' ';
		        	System.out.println(i);
		        }
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		createBoard();
	    
		

	}

}
