package org.studentdata.dao.extractor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.studentdata.model.StudentData;

@Component
public class StudentDataListExtractor implements ResultSetExtractor<List<StudentData>>{

	ArrayList<StudentData> studentData= new ArrayList();
	
 	@Override
	public List<StudentData> extractData(ResultSet rs) throws SQLException, DataAccessException {
		StudentData sd;
		
		while(rs.next())
		{
			sd= new StudentData();
			sd.setS_rollNo(rs.getInt("s_rollNo"));
			sd.setSname(rs.getString("sname"));
			sd.setAge(rs.getInt("age"));
			sd.setEmail(rs.getString("emailid"));
			studentData.add(sd);
		}
		
		return studentData;
	}

	
}
