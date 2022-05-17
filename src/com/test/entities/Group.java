package com.test.entities;

import java.util.Set;

public class Group {

    private int groupID;

    private String groupName;

    private Set<Student> students;


    public Group(int groupID, String groupName, Set<Student> students) {
        this.groupID = groupID;
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
    }

    public int getGroupID() {
        return groupID;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupID=" + groupID +
                ", groupName='" + groupName + '\'' +
                ", students=" + students +
                '}';
    }
}
