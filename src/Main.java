import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SchoolManagementApp attendance = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp grading    = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp library    = new LibrarySystemAdapter(new LibrarySystem());

        List<SchoolManagementApp> systems = new ArrayList<>();
        systems.add(attendance);
        systems.add(grading);
        systems.add(library);

        System.out.println("=== School Management Application ===");
        for (SchoolManagementApp system : systems) {
            system.integrateSystem();
            System.out.println();
        }
    }
}
