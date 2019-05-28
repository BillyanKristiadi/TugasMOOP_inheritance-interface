package the6char;

import occupation.*;

public class worker extends BaseChar implements IWorker {

	public worker() {
		// TODO Auto-generated constructor stub
		nama = "Worker";
		description = "Seseorang yang bisa bekerja";
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(nama +" "+ description);
	}

}
