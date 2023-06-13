package org.studentdata.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.studentdata.model.StudentData;
import org.studentdata.service.StudentDataService;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("studentdata")
@AllArgsConstructor
public class StudentDataController {

	private StudentDataService studentDataService;
	
	@GetMapping
	public List<StudentData> getStudentDataCtrl() {
		List<StudentData> studentData= studentDataService.getStudentDataService();
		return studentData;
     }
	
	@GetMapping("/{snum}")
	public StudentData getStudBySrollNoCtrl(@PathVariable (value = "snum") int s_rollNo)
	{
		StudentData sd= studentDataService.getStudByS_rollnoSevice(s_rollNo);
		return sd;
	}
	
	@PostMapping
	public void insertStudCtrl(@RequestBody StudentData studentData)
	{
		studentDataService.insertStudService(studentData);
	}
	
	@PutMapping
	public void updateStudCtrl(@RequestBody StudentData studentData)
	{
		studentDataService.updateStudService(studentData);
	}
	
	@DeleteMapping("/{snum}")
	public void deleteStudCtrl(@PathVariable (value = "snum") int s_rollNo)
	{
		studentDataService.deleteStudService(s_rollNo);
	}
}
