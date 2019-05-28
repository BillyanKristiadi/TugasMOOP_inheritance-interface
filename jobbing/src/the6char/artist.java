package the6char;

import occupation.*;

public class artist extends BaseChar implements IArtist {

	public artist() {
		// TODO Auto-generated constructor stub
		nama = "Artist";
		description = "Seseorang yang bisa melukis";
	}
	

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(nama +" "+ description);
	}

}
