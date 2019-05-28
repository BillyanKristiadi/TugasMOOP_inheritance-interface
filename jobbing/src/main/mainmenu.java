package main;

import java.util.Scanner;
import the6char.*;
import occupation.*;

public class mainmenu {

	Scanner scan = new Scanner(System.in);
	public mainmenu() {
		
		String command;
		String angkasiapa;
		String[] campur;
		
		
		String aksi;
		String[] angkalist;
		
		int count=0;
		do
		{
			System.out.println("\n1. Chef");
			System.out.println("2. Driver");
			System.out.println("3. Worker");
			System.out.println("4. Artist");
			System.out.println("5. Unskilled");
			System.out.println("6. Prodigy");
			System.out.println("Choose the job : [aksi, angka]");
			
			command = scan.nextLine();
			
			campur=command.split(" ");
			
			aksi = campur[0];
			
			angkasiapa = campur[1];
			
			angkalist=angkasiapa.split(",");
			
//			System.out.println(aksi);
//			
//			for(int i=0;i<angkalist.length;i++)
//			{
//				System.out.println(angkalist[i]);
//			}
			
			
			
			if(aksi.equalsIgnoreCase("info"))
			{
				for(int i=0;i<angkalist.length;i++)
				{
					if(angkalist[i].equals("1"))
					{
						BaseChar person = new chef();
						person.getInfo();
					}
					else if(angkalist[i].equals("2"))
					{
						BaseChar person = new driver();
						person.getInfo();
					}
					else if(angkalist[i].equals("3"))
					{
						BaseChar person = new worker();
						person.getInfo();
					}
					else if(angkalist[i].equals("4"))
					{
						BaseChar person = new artist();
						person.getInfo();
					}
					else if(angkalist[i].equals("5"))
					{
						BaseChar person = new unskilled();
						person.getInfo();
					}
					else if(angkalist[i].equals("6"))
					{
						BaseChar person = new prodigy();
						person.getInfo();
					}
				}
			}
			else if(aksi.equalsIgnoreCase("work"))
			{
				for(int i=0;i<angkalist.length;i++)
				{
					if(angkalist[i].equals("1"))
					{
						BaseChar person = new chef();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("2"))
					{
						BaseChar person = new driver();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("3"))
					{
						BaseChar person = new worker();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("4"))
					{
						BaseChar person = new artist();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("5"))
					{
						BaseChar person = new unskilled();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("6"))
					{
						BaseChar person = new prodigy();
						if(person instanceof IWorker)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" bekerja");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
				}
			}
			else if(aksi.equalsIgnoreCase("cook"))
			{
				for(int i=0;i<angkalist.length;i++)
				{
					if(angkalist[i].equals("1"))
					{
						BaseChar person = new chef();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("2"))
					{
						BaseChar person = new driver();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("3"))
					{
						BaseChar person = new worker();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("4"))
					{
						BaseChar person = new artist();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("5"))
					{
						BaseChar person = new unskilled();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("6"))
					{
						BaseChar person = new prodigy();
						if(person instanceof IChef)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" memasak");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
				}
			}
			else if(aksi.equalsIgnoreCase("drive"))
			{
				for(int i=0;i<angkalist.length;i++)
				{
					if(angkalist[i].equals("1"))
					{
						BaseChar person = new chef();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("2"))
					{
						BaseChar person = new driver();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("3"))
					{
						BaseChar person = new worker();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("4"))
					{
						BaseChar person = new artist();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("5"))
					{
						BaseChar person = new unskilled();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("6"))
					{
						BaseChar person = new prodigy();
						if(person instanceof IDriver)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" mengemudi");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
				}
			}
			else if(aksi.equalsIgnoreCase("paint"))
			{
				for(int i=0;i<angkalist.length;i++)
				{
					if(angkalist[i].equals("1"))
					{
						BaseChar person = new chef();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("2"))
					{
						BaseChar person = new driver();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("3"))
					{
						BaseChar person = new worker();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("4"))
					{
						BaseChar person = new artist();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("5"))
					{
						BaseChar person = new unskilled();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
					else if(angkalist[i].equals("6"))
					{
						BaseChar person = new prodigy();
						if(person instanceof IArtist)
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" melukis");
						}
						else
						{
							System.out.println(person.getClass().toString().replaceFirst("class the6char.", "")+" tidak bisa melakukan hal ini");
						}
					}
				}
			}
			
		}while(count==0);
}
	
	
public static void main(String[] args) {
	new mainmenu();
}
}

