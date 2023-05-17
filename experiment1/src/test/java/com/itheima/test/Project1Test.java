package com.itheima.test;

import com.itheima.pojo.Course;
import com.itheima.pojo.School;
import com.itheima.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class Project1Test {
    @Test
    public void findCourseWithSchoolByCIdTest(){
        SqlSession session= MyBatisUtils.getSession();
        School school=session.selectOne("com.itheima.mapper.SchoolMapper.findCourseWithSchoolByCId",2);
        System.out.println(school);
        session.close();
    }
    @Test
    public void findCourseWithSchoolBySIdTest(){
        SqlSession session= MyBatisUtils.getSession();
        School school=session.selectOne("com.itheima.mapper.SchoolMapper.findCourseWithSchoolBySId",1);
        System.out.println(school);
        session.close();
    }

    @Test
    public void updateCourseByIdTest(){
        Course course=new Course();
        course.setId(4);
        course.setHours(40);
        SqlSession session= MyBatisUtils.getSession();
        session.update("com.itheima.mapper.SchoolMapper.updateCourseById",course);
        session.commit();
        session.close();

    }

    @Test
    public void saveTest(){
        Course course=new Course();
        course.setName("大数据存储");
        course.setHours(32);
        course.setSchools(1);
        SqlSession session= MyBatisUtils.getSession();
        session.update("com.itheima.mapper.SchoolMapper.save",course);
        session.commit();
        session.close();

    }
    @Test
    public void findCourseWithSchoolByIdTest(){
        SqlSession session= MyBatisUtils.getSession();
        School school1=session.selectOne("com.itheima.mapper.SchoolMapper.findCourseWithSchoolById",1);
        School school2=session.selectOne("com.itheima.mapper.SchoolMapper.findCourseWithSchoolById",2);

        System.out.println(school1);
        System.out.println(school2);
        session.close();
    }

}
