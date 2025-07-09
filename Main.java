
import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();
        int choice;

        do {
            System.out.println("Student Management ");
            System.out.println("1. Add Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Search by Name");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter full name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter GPA: ");
                        double gpa = Double.parseDouble(sc.nextLine());
                        Student s = new Student(id, name, gpa);
                        service.addStudent(s);
                       
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input format.");
                    }
                    break;
                case 2:
                    System.out.print("Enter ID to delete: ");
                    int id = Integer.parseInt(sc.nextLine());
                    boolean deleted = service.deleteStudent(id);
                    System.out.println(deleted ? "Deleted." : "ID not found.");
                    break;
                case 3:
                    System.out.print("Enter name to search: ");
                    String keyword = sc.nextLine();
                    service.searchByName(keyword);
                    break;
                case 4:
                    service.displayAll();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
    
}
