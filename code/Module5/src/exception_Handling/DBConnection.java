package exception_Handling;

public class DBConnection {
	final int z=100;

	public static void main(String[] args) {
		
		try{
			// connecting db - success
			// query - pull  - exception
			System.out.println("A");
			int i=2/0;
			System.out.println("B");
			
			
		}catch(Exception e){
			System.out.println("Some exception");
		}finally{
			// close - if established
			System.out.println("Finally");
		}
	}

}
