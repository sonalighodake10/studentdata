package org.studentdata.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.studentdata.dao.StudentDataDao;
import org.studentdata.dao.extractor.StudentDataExtractor;
import org.studentdata.dao.extractor.StudentDataListExtractor;
import org.studentdata.model.StudentData;

import lombok.AllArgsConstructor;


@Repository
@AllArgsConstructor
public class StudentDataDaoImpl  implements StudentDataDao{

	  private JdbcTemplate jdbcTemplate;
	  private StudentDataListExtractor studentDataListExtractor;
	  private StudentDataExtractor studentDataExtractor;
	  
	@Override
	public List<StudentData> getStudentList() {
		List<StudentData> sd = jdbcTemplate.query("select * from studentdata",studentDataListExtractor::extractData);
		return sd;
	}

	@Override
	public StudentData getStudentByRollNo(int s_rollNo) {
		
		StudentData sd= jdbcTemplate.query("select * from studentdata where s_rollNo="+s_rollNo, studentDataExtractor::extractData);
		return sd;
	}

	@Override
	public void insertStudent(StudentData studentData) {
		String query= "insert into studentdata values("+studentData.getS_rollNo()+",'"+studentData.getSname()+"',"+studentData.getAge()+",'"+studentData.getEmail()+"')";
	     jdbcTemplate.update(query);
	}

	@Override
	public void updateStudent(StudentData studentData) {
		String query= "update studentdata set sname='"+studentData.getSname()+"', age="+studentData.getAge()+",emailid='"+studentData.getEmail()+"' where s_rollNo="+studentData.getS_rollNo();
	     jdbcTemplate.update(query);
	
	}

	@Override
	public void deleteStudent(int s_rollNo) {
		String query="delete from studentdata where s_rollNo=" + s_rollNo;
		jdbcTemplate.update(query);
	}

}
