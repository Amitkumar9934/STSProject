package com.example.course.repository;

import com.example.course.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Query("SELECT COUNT(s) FROM Student s JOIN s.courses c WHERE c.courseName = :courseName")
    int countStudentsInCourse(String courseName);
}

