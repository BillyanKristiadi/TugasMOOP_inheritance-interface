package the6char;

import occupation.*;

public class chef extends BaseChar implements IChef {

	public chef() {
		// TODO Auto-generated constructor stub
		nama = "Chef";
		description = "Seseorang yang bisa memasak";
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(nama +" "+ description);
	}

}
