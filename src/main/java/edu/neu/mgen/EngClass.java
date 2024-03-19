package edu.neu.mgen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EngClass {
   private final List<Student> students = new ArrayList<>();

   public void addStudent(Student student) {
      students.add(student);
   }

   public boolean deleteStudent(int studentId) {
      Iterator<Student> iterator = students.iterator();
      while (iterator.hasNext()) {
         Student student = iterator.next();
         if (student.getStudentId() == studentId) {
            iterator.remove();
            return true;
         }
      }
      return false;
   }

   public void listStudents() {
      if (students.isEmpty()) {
         System.out.println("No students enrolled.");
      } else {
         System.out.println("Students in Engineering Class:");
         for (Student student : students) {
            System.out.println(student);
         }
      }
   }
}