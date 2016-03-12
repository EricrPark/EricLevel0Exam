/* Level 0 Exam: Coding  Exercise #1 */
import java.awt.Color;

import javax.swing.JOptionPane;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class CodingExercise1
{
	public static void main(String[] args)
	{
		// 3. ask the user what color they would like the tortoise to draw
		String y = JOptionPane.showInputDialog("Which color would you like the tortoise to draw--blue, yellow, red, black, cyan, gray, and green");
		// 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
		if(y.equalsIgnoreCase("Blue")) {
			Tortoise.setPenColor(Color.blue);
		}
		else if(y.equalsIgnoreCase("Yellow")) {
			Tortoise.setPenColor(Color.yellow);
		}
		else if(y.equalsIgnoreCase("Red")) {
			Tortoise.setPenColor(Color.red);
		}
		else if(y.equalsIgnoreCase("black")) {
			Tortoise.setPenColor(Color.black);
		}
		else if(y.equalsIgnoreCase("Cyan")) {
			Tortoise.setPenColor(Color.cyan);
		}
		else if(y.equalsIgnoreCase("Gray")) {
			Tortoise.setPenColor(Color.gray);
		}
		else if(y.equalsIgnoreCase("Green")) {
			Tortoise.setPenColor(Color.green);
		}
		// 2. set the pen width to 10
		Tortoise.setPenWidth(10);
		// 1. make the tortoise draw a shape
		for (int i = 0; i < 4; i++) {
			Tortoise.move(90);
			Tortoise.turn(90);
		}
	}
}





