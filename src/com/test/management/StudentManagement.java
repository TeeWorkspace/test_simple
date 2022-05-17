package com.test.management;

import com.test.entities.Group;
import com.test.entities.Student;
import com.test.view.Menu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;


public class StudentManagement {

    private Menu menu = new Menu();

    private List<Group> groups = new ArrayList<>();

    private Random random = new Random();

    public void init(){
        Group group1 = new Group(1, "Group1", new HashSet<>());
        Group group2 = new Group(2, "Group2", new HashSet<>());
        Group group3 = new Group(3, "Group3", new HashSet<>());
        groups.add(group1);
        groups.add(group2);
        groups.add(group3);

    }

    public boolean addStudent(){
        Student student = menu.inputStudent();
        Group group = getGroup();
        student.setGroupID(group.getGroupID());
        group.getStudents().add(student);
        System.out.println("Successfully");
        return true;
    }

    public void print(){
        groups.stream().forEach(g ->
            System.out.println(g));
    }


    public Group getGroup(){
        int index = random.nextInt(groups.size());
        Group group = groups.get(index);
        return group;
    }
}
