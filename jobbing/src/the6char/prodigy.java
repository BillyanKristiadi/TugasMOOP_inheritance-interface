package the6char;

import occupation.*;

public class prodigy extends BaseChar implements IArtist, IDriver, IChef, IWorker {

	public prodigy() {
		// TODO Auto-generated constructor stub
		nama = "Prodigy";
		description = "Seseorang yang bisa banyak hal";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
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
