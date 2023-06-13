package org.studentdata.dao.extractor;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;
import org.studentdata.model.StudentData;

@Component
public class StudentDataExtractor implements ResultSetExtractor<StudentData> {

	@Override
	public StudentData extractData(ResultSet rs) throws SQLException, DataAccessException {
		StudentData sd= new StudentData();
		
		if(rs.next())
		{
			sd.setS_rollNo(rs.getInt("s_rollNo"));
			sd.setSname(rs.getString("sname"));
			sd.setAge(rs.getInt("age"));
			sd.setEmail(rs.getString("emailid"));
			
		}
				
		
		return sd;
	}

}
