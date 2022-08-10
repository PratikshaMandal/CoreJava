package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee E1 = new Employee();
		
		E1.Name = "Mike";
		E1.EmpId = 1000;
		E1.Department = "HR";
		E1.Display();
		
		Employee E2 = new Employee("Jack", 1001, "Finance");
		E2.Display();
		
		Bank B = new Bank();
		
		B.displayBalance();
		int Bal = B.getBalance();
		B.AccountNum = 500;
		
		System.out.println("The Balance is " + B.getBalance());
		System.out.println("The Balance is " + Bal);
		
		BOABank B1 = new BOABank();
		
		B1.ccBalance();
		B1.displayBalance();
		
		B1.AccountNum =100;
        OverLoadingExample obj =new OverLoadingExample();
		
		int RecArea = obj.GetArea(3, 4);
		
		int SqArea = obj.GetArea(4);

		Chrome ch=new Chrome();
		ch.colseBrowser();
		ch.openBrowser();
		
		Browser br=new Chrome();
		
		HondaCar hc=new HondaCar();
		hc.start();
		hc.stop();
		
		
		EncapsulationExample ee=new EncapsulationExample();
		 ee.setBalance(1111);
		 System.out.println("GetBalance"+ee);
		 ee.setName("abc");
	}
	
}
