package exception_Handling;

public class ComposeEmailTest {

	public static void main(String[] args) throws Exception {
		
		throw new Exception("Some error");
		// throws
		/*
		String[] x = new String[2];
		x[0]="India";
		x[1]="USA";
		//x[2]="UK";
		
		//checked
		delay();
			*/
		
	}
	
	public static void delay() throws InterruptedException{
		Thread.sleep(50000);
	}

}
