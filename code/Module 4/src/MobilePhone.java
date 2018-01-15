
public class MobilePhone extends Phone{

	
	public void roamFree(){
		System.out.println("Mobile roaming");
	}
	
	// overriding
	@Override // annotation
	public void call(){ // normal call
		System.out.println("Mobile calling");
		
	}
	
	
	
}
