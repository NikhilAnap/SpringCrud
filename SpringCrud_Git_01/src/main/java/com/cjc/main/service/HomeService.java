package com.cjc.main.service;

import com.cjc.main.model.Student;

public interface HomeService {

 public void saveData(Student s);

public Student singledata(int sId);

public void delete(int id);

public Iterable<Student> getAll();

}
