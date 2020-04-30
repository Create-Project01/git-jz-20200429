package com.imti.dao;

import com.imti.pojo.Student;

public class StudentDao {
    public void insertStudent(Student student) {
    	System.out.println("insert Student"+ student);
    }
    
    public void deleteStudent(Integer id) {
    	System.out.println("delete Student"+id);
    }
}
