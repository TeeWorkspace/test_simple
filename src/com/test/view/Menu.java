package com.test.view;

import com.test.entities.Student;
import com.test.utlis.Validator;

public class Menu {

    private Validator validator = new Validator();

    public Student inputStudent(){
        System.out.println("Enter student id: ");
        int id = Integer.parseInt(validator.getInput());
        System.out.println("Enter student name: ");
        String studentName = validator.getInput();
        return new Student(id, studentName);
    }

}
