public class DiceRunner{
	public static void main(String[]args){

		//Test 1
		Die die1 = new Die();
		Die die2 = new Die();

		System.out.println("Test 1\nDie #1 rolls:");
		int count1 = 0;
		while(die1.getValue()!=1){
			die1.roll();
			System.out.println(die1);
			count1++;
		}

		int count2 = 0;
		System.out.println("\nDie #2 rolls:");
		while(die2.getValue()!=1){
			die2.roll();
			System.out.println(die2);
			count2++;
		}

		System.out.println("\nIt took "+(count1+count2)+" total rolls to get snake eyes.\n");
	}
}