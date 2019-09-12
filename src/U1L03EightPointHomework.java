import javax.swing.JOptionPane;

public class U1L03EightPointHomework {

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "Type a year: ");
		int userYear = Integer.parseInt(input);
		
		if ((userYear % 4 == 0))
		{
			System.out.println(userYear + " is a leap year!");
		}
			else		 
		{
				System.out.println("user");
		}

	} */

	/* public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = JOptionPane.showInputDialog(null, "Type a number: ");
		int userNum = Integer.parseInt(input);
		int sum = 0;
		
		for (int i = userNum; i > 0; i --)
		{
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println(sum);
				
		{
			
		}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userLetter = JOptionPane.showInputDialog(null, "Type a letter from the alphabet: ");
		
		if (userLetter.equals("a") || userLetter.equals("e") || userLetter.equals("i") || userLetter.equals("o") || userLetter.equals("u"))
		{
			System.out.println(userLetter + " is a vowel!");
		}
 
		else if (userLetter.equals("b") || userLetter.equals("c") || userLetter.equals("d") || userLetter.equals("f") || userLetter.equals("g") || userLetter.equals("h") || userLetter.equals("j") || userLetter.equals("k") || userLetter.equals("l") || userLetter.equals("m") || userLetter.equals("n") || userLetter.equals("p") || userLetter.equals("q") || userLetter.equals("r") || userLetter.equals("s") || userLetter.equals("t") || userLetter.equals("v") || userLetter.equals("w") || userLetter.equals("x") || userLetter.equals("y") || userLetter.equals("z"))
		{
			System.out.println(userLetter + " is a consantant!");
		}
		
		else
		{
			System.out.println("Error");
		}

		
		
	
	
}}
