/*
 *
 * You can use the following import statements
 * 
 * import org.springframework.data.jpa.repository.JpaRepository;
 * import org.springframework.stereotype.Repository;
 * 
 */

// Write your code here

package com.example.university.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.university.model.Course;
import com.example.university.model.Professor;

import java.util.List;

@Repository
public interface CourseJpaRepository extends JpaRepository<Course, Integer> {
    List<Course> findByProfessor(Professor professor);
}