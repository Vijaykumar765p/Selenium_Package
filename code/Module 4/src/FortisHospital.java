
public class FortisHospital implements Hospital{

	@Override
	public void operate() {
		
		System.out.println("Fortis operating");
	}

	@Override
	public void doScan() {
		System.out.println("Fortis Scanning");
		
	}

	@Override
	public void doVaccination() {
		
		System.out.println("Fortis Vaccination");
		
	}
	
	
	public void PhoneConsultation(){
		System.out.println("Fortis PhoneConsultation");
	}

}
