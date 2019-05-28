package the6char;

import occupation.*;

public class unskilled extends BaseChar {

	public unskilled() {
		// TODO Auto-generated constructor stub
		nama = "Unskilled";
		description = "Seseorang yang belum bisa";
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(nama +" "+ description);
	}

}
