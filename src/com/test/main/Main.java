package com.test.main;

import com.test.management.StudentManagement;

public class Main {
    public static void main(String[] args) {
        // I do it simple
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.init();
        studentManagement.addStudent();
        studentManagement.print();

    }
}
