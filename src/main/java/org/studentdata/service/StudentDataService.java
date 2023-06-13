package org.studentdata.service;

import java.util.List;

import org.studentdata.model.StudentData;

public interface StudentDataService {
	public List<StudentData> getStudentDataService();
	public StudentData getStudByS_rollnoSevice(int s_rollNo);
	public void insertStudService(StudentData studentData);
	public void updateStudService(StudentData studentData);
	public void deleteStudService(int s_rollNo);
	
	

}
