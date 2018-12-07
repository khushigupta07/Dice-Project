public class Die{


	private int sides;
	private int value;

	public Die(){
		sides = 6;
		value = (int)(Math.random()*sides)+1;
	}

	public Die(int sides){
		this.sides = sides;
		value = (int)(Math.random()*sides)+1;
	}

	public void setSides(int sides){
		this.sides = sides;
	}

	public int getSides(){
		return sides;
	}

	public void roll(){
		value = (int)(Math.random()*sides)+1;
	}

	public int getValue(){
		return value;
	}

	public String toString(){
		return "You rolled a "+value+" on a "+sides+"-side die";
	}

}