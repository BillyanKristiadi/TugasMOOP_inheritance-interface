package the6char;

import occupation.*;

public class driver extends BaseChar implements IDriver {
	
	public driver() {
		// TODO Auto-generated constructor stub
		nama = "Driver";
		description = "Seseorang yang bisa menyetir";
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(nama +" "+ description);
	}

}
