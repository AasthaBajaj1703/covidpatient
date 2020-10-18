package CovidPatient;
import java.util.Scanner;

/**This class contains the main() method. It interacts with the user 
 * and takes the input for the Covid Patient
 * @param Name Patient's name
 * @param Dob Patients's date of birth
 * @param Bloodgroup Patient's blood group
 * @param Report Patient's Covid test report
 * @param Address Patient's home address
 * @param Telephone Patient's mobile or telephone number
 * @param Adhaar Patient's Adhaar number
 * @param Age Patient's Age
 * @param choice to take user's choice (Y/N) for the continuation after adding one record
 * @author Lenovo
 *
 */
public class User {

	public static void main(String[] args) {
		String Name;
		String Dob;
		String Bloodgroup;
		String Report;
		String Address;
		String Telephone;
		long Adhaar;
		int Age;
		char choice;
		
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Patient Name : ");
			Name = sc.next();
			System.out.println("Patient's Age : ");
			Age = sc.nextInt();
			System.out.println("Date of Birth : ");
			Dob = sc.next();
			System.out.println("Blood Group : ");
			Bloodgroup = sc.next();
			System.out.println("Test Report : ");
			Report = sc.next();
			System.out.println("Contact Address : ");
			Address = sc.next();
			System.out.println("Telephone Number : ");
			Telephone = sc.next();
			System.out.println("Adhaar Number : ");
			Adhaar = sc.nextLong();
		
			CovidPatient covidPatient = new CovidPatient(Name,Age,Dob,Bloodgroup,Report,Address,Telephone,Adhaar); 
			covidPatient.display();
			System.out.println("Do you want to add another record(Y/N)?");
			choice = sc.next().charAt(0);
		}while(choice=='Y');
		
	}

}
