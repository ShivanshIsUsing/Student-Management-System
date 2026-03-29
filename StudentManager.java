import java.util.ArrayList;

class StudentManager {
    ArrayList<Student> students = new ArrayList<>();

    void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            s.display();
        }
    }

    void deleteStudent(int id) {
        boolean found = false;
        for (Student s : students) {
            if (s.id == id) {
                students.remove(s);
                found = true;
                System.out.println("Student deleted.");
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }
}