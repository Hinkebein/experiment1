package com.itheima.pojo;

import java.util.List;

public class School {
    private int id;
    private String schoolname;
    private List<Course> courseList;

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", schoolname='" + schoolname + '\'' +
                ", courseList=" + courseList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
}
