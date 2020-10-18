package CovidPatient;

/**This class have the constructors which are intializing the variables 
 * i.e. the Covid Patient's details which are inserted by user in the User class.
 * It also contains the method display() which is printing the Patient's details
 * @param name Patient's name
 * @param dob Patients's date of birth
 * @param bloodgroup Patient's blood group
 * @param report Patient's Covid test report
 * @param address Patient's home address
 * @param telephone Patient's mobile or telephone number
 * @param adhaar Patient's Adhaar number
 * @param age Patient's Age
 * @author Lenovo
 *
 */
public class CovidPatient {
	String name;
	static int ID=0;
	String dob;
	String bloodgroup;			
	String report;
	String address;
	String telephone;
	long adhaar;
	int age;
	
	
	/**This default constructor is called everytime the parametrized constructor is 
	 * called and it increments the value of ID in order to give unique id for every
	 * patient
	 */
	public CovidPatient() {
		++ID;
	}
	/**
	 * @param name
	 * @param age
	 * @param dob
	 * @param bloodgroup
	 * @param report
	 * @param address
	 * @param telephone
	 * @param adhaar
	 */
	public CovidPatient(String name,int age,String dob,String bloodgroup,String report,String address,String telephone,long adhaar) {
		this();
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.bloodgroup = bloodgroup;
		this.report = report;
		this.address = address;
		this.telephone = telephone;
		this.adhaar = adhaar;
		
	}
	
	
	/**prints the details of the patient whenever called by the object
	 * 
	 */
	void display(){
		System.out.println("\n\nPatient Id : "+ID+"\nPatient Name : "+name+"\nAge"+age+"\nDate of Birth : "+dob+"\nBlood Group : "+bloodgroup+"\nAddress : "+address);
		System.out.println("Telephone : "+telephone+"\nAdhaar Number : "+adhaar);
		
	}
	
}
