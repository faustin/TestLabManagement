package requestmanagement;

import java.util.Date;
import java.util.List;

public class LabRequest {
	private String patient;
	private String location;
	private Date birthDate;
	private List<LabTest> testsList;
	public String getPatient() {
		return patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public List<LabTest> getTestsList() {
		return testsList;
	}
	public void setTestsList(List<LabTest> testsList) {
		this.testsList = testsList;
	}
	
	
}
