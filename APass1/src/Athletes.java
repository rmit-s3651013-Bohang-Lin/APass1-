
import java.util.ArrayList;
import java.util.Scanner;

public class Athletes extends Participates {
	ArrayList<String> type;
	
	
	public Athletes(int athID,String athName,int athAge,String athState)
	{
		super(athID, athName, athAge, athState);
		type = new ArrayList<String>();
	}

	//增加四种运动员
	
	public void addType()
	{
		  
        type.add("swimmers");  
        type.add("cyclists");  
        type.add("sprinters");
        type.add("superAthletes"); //get(3) 调用
	}
	
	/*
	public String  getName(int y)
	{
		return super.getName();
	}
	*/
	/*
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter athlete unique ID: ");
		uniqueID = keyboard.nextInt();
		System.out.println("Enter athlete name: ");
		name = keyboard.nextLine();
		System.out.println("Enter athlete age: ");
		age = keyboard.nextInt();
		System.out.println("Enter athlete state: ");
		state = keyboard.nextLine();
	}
	public void writeOutput()
	{
		System.out.println("athlete unique ID: " + uniqueID);
	}*/
}
