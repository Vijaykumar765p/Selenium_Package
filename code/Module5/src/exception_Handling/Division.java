package exception_Handling;

public class Division {

	public static void main(String[] args) {
		System.out.println("Start");
		
		try{
			multiply();
		}catch(Exception e){
			System.out.println("error A");
		}
		
		System.out.println("End");
		/*
		try{
			System.out.println("A");
			int i=2/0;
			System.out.println("B");
			System.out.println(i);
		}catch(Exception e){
			System.out.println("Some error "+ e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("C");
		
		try{
			//clicking on link
		}catch(ElementNotFoundException e){
			
		}catch(ElementNotVisibleException e){
			
		}catch(Exception e){
			
		}
		*/
		
		
	}
	
	public static void multiply(){
	
			divide();
		
		
	}
	
	public static void divide(){
		
		
			System.out.println("A");
			int i=2/0;
			System.out.println("B");
		
		
	}

}
