package org.studentdata.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.studentdata.dao.StudentDataDao;
import org.studentdata.model.StudentData;
import org.studentdata.service.StudentDataService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class StudentDataServiceImpl  implements StudentDataService{
	
	 private StudentDataDao studentDataDao;
	@Override
	public List<StudentData> getStudentDataService() {
		
	List<StudentData> sd= studentDataDao.getStudentList();
	return sd;
	}
	@Override
	public StudentData getStudByS_rollnoSevice(int s_rollNo) {
		StudentData sd= studentDataDao.getStudentByRollNo(s_rollNo);
		return sd;
	}
	@Override
	public void insertStudService(StudentData studentData) {
		studentDataDao.insertStudent(studentData);
	}
	@Override
	public void updateStudService(StudentData studentData) {
		
		studentDataDao.updateStudent(studentData);
	}
	@Override
	public void deleteStudService(int s_rollNo) {
		studentDataDao.deleteStudent(s_rollNo);
	}

}
