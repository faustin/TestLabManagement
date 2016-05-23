package requestmanagement;

import java.util.ArrayList;
import java.util.List;

public class MainTesting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<LabTest> testList = new ArrayList<LabTest>();
		
		LabTest lt = new LabTest();
		lt.setResult("Positive");
		lt.setTestId(18);
		lt.setTestname("Malaria");
		
		LabTest lt1 = new LabTest();
		lt1.setResult("Negative");
		lt1.setTestId(12);
		lt1.setTestname("HIV");
		
		testList.add(lt);
		testList.add(lt1);
		
		LabRequest r = new LabRequest();
		r.setBirthDate(null);
		r.setLocation("Kibagabaga");
		r.setPatient("Muhire");
		r.setTestsList(testList);
		
		System.out.println("Print LabRequest.......");
	}

}
