package nandu;

abstract class Atm2
{
	abstract void withdraw();
	
}

class DataAbstraction extends atm
{
	
 void withdraw()
 {
		System.out.println("withdraw successful");
 }
	
public static void main(String args[])
{
	DataAbstraction ob1 =new DataAbstraction();
	ob1.withdraw();
}
}