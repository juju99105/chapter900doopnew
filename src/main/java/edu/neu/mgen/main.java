package edu.neu.mgen;

public class main {
   public static void main(String[] args) {
      EngClass engClass = new EngClass();

      // Adding students
      engClass.addStudent(new Student(1, "Alex", "Vause"));
      engClass.addStudent(new Student(2, "Piper", "Chapman"));
      engClass.addStudent(new Student(3, "Galinda", "Reznikov"));
      engClass.addStudent(new Student(4, "Gloria", "Mendoza"));
      engClass.addStudent(new Student(5, "Tiffany", "Doggett"));
      engClass.addStudent(new Student(7, "Angela", "Rice"));

      engClass.listStudents();

      System.out.println("Deleting student with ID 2, 4 and 5");
      engClass.deleteStudent(2);
      engClass.deleteStudent(4);
      engClass.deleteStudent(5);

      engClass.listStudents();
   }
}