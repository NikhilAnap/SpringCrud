
package com.cjc.main.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.model.Student;
import com.cjc.main.repository.HomeRepository;
import com.cjc.main.service.HomeService;

@Service
public class HomeServiceImpl  implements HomeService{
	
	@Autowired
	HomeRepository hr;

	@Override
	public void saveData(Student s) {
		hr.save(s);
		
	}

	@Override
	public Student singledata(int sId) {
		
		Optional<Student> stud=hr.findById(sId);
		
		
		return stud.get();
	}

	@Override
	public void delete(int id) {
		hr.deleteById(id);
		
	}

	@Override
	public Iterable<Student> getAll() {

		return hr.findAll();
	}

}
