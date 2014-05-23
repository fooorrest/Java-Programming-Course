// A test driver program for the Student class
public class shapes
{
   public static void main(String[] args) 
   {
      Student student1 = new Student("Forrest Singletary");
      student1.addCourseGrade("Math", 89);
      student1.addCourseGrade("English", 57);
      student1.addCourseGrade("Spanish", 96);
      student1.printGrades();
      System.out.printf("The average grade is %.2f", student1.getAverageGrade());
   }
}