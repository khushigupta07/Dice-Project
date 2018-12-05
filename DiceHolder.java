import java.util.*;
public class DiceHolder{
	private ArrayList<Die> container = new ArrayList<>();
	public DiceHolder(){
		container.add(new Die());
	}
	public int addDie(Die die){
		if(container.size()<=6){
			this.container.add(die);
			return 1;
		}
		else
			return -1;
	}
	public void shake(){
		for(int i = 0; i < container.size(); i++){
			container.get(i).roll();
		}
	}
	public String toString(){
		String outputstring = "";
		for(int i = 0; i < container.size(); i++){
			outputstring+=container.get(i)+"\n";
		}
		return outputstring;
	}
}