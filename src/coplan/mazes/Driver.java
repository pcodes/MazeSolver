package coplan.mazes;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String xString = sc.nextLine();
		String yString = sc.nextLine();
		
		int x = Integer.parseInt(xString);
		int y = Integer.parseInt(yString);

		
		Maze maze = new Generator(x, y).getMaze();
		
		
		Display d = new Display();
		
		d.drawMaze(maze);
		//d.drawSolution(maze);		
		
		//TODO: make mazes into complex mazes by opening up more holes in walls, which may generate loops
		//TODO: solve mazes, both simple and complex
		//TODO: Making this change to demonstrate a commit.
	}
}
