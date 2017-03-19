import java.util.*;

public class AthletesList {
	private String[] subjects;
	private ArrayList<Athletes> list;
	//private String[] athleteType;
	public AthletesList() {
		
		list = new ArrayList<Athletes>();
		//athleteType = new String[4];
	}
	//增加运动员信息
	public void addAthlete(int athID,String athName,int athAge,String athState)
	{
		Athletes info = new Athletes(athID, athName, athAge, athState);
		list.add(info);
	}
	
	/*
	public int ddd()
	{
		athleteList.add();
		athleteList.remove();
		athleteList.get(1).getName();//提取排名1号位的运动员的名字
	}*/
}
