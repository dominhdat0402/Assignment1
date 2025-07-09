

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
    
    }

    public void displayAll() {
     
    }

    private boolean isDuplicateId(int id) {
        for (Student s : students) {
            if (s.getId() == id) return true;
        }
        return false;
    }
}
