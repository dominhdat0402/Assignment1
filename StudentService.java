

import java.util.ArrayList;
import java.util.List;

public class StudentService {
     List<Student> students = new ArrayList<>();

    public boolean addStudent(Student student) {
        if (isDuplicateId(student.getId())) {
            System.out.println("Error: Duplicate ID.");
            return false;
        }
        if (!CheckInputData.isValidGpa(student.getGpa()) || !CheckInputData.isValidName(student.getFullName())) {
            System.out.println("Error: Invalid GPA or name.");
            return false;
        }
        students.add(student);
        return true;
    }

    public boolean deleteStudent(int id) {
        return students.removeIf(s -> s.getId() == id);
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (Student s : students) {
            if (s.getFullName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No student found.");
        }
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students to display.");
        } else {
            System.out.println("ID        Name                  GPA");
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    private boolean isDuplicateId(int id) {
        for (Student s : students) {
            if (s.getId() == id) return true;
        }
        return false;
    }
}
