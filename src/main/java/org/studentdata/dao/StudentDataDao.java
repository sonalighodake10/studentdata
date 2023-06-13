package org.studentdata.dao;

import java.util.List;

import org.studentdata.model.StudentData;

public interface StudentDataDao {

	public List<StudentData> getStudentList();
	public StudentData getStudentByRollNo(int s_rollNo);
	public void insertStudent(StudentData studentData);
	public void updateStudent(StudentData studentData);
	public void deleteStudent(int s_rollNo);

}
