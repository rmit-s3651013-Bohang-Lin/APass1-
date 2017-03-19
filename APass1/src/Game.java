import java.util.*;

public class Game {
	private static int ID; //只在constructor 调用
	private Officials offi;//裁判
	private int popu;  //运动员人数
	private String name; //项目名
	 
	
	public Game()
	{
		ID += 1;
		name = "";
		//offi = Officials.getOff();
		popu = 1;
	}
	
	public void record()
	{
		offi.getArray().add(mess)
	}
	
}
