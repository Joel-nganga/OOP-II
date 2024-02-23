import java.util.ArrayList;
import java.util.Scanner;

class MaintenanceRecord {
    private String houseAddress;
    private String maintenanceType;
    private String description;
    private String date;

    public MaintenanceRecord(String houseAddress, String maintenanceType, String description, String date) {
        this.houseAddress = houseAddress;
        this.maintenanceType = maintenanceType;
        this.description = description;
        this.date = date;
    }

    // Getters and setters
    // You can generate these automatically in IDEs like IntelliJ IDEA or Eclipse

    @Override
    public String toString() {
        return "House Address: " + houseAddress + "\nMaintenance Type: " + maintenanceType +
                "\nDescription: " + description + "\nDate: " + date;
    }
}

class RealEstateManagementApp {
    private ArrayList<MaintenanceRecord> maintenanceRecords = new ArrayList<>();

    public void addMaintenanceRecord(MaintenanceRecord record) {
        maintenanceRecords.add(record);
        System.out.println("Maintenance Record added successfully.");
    }

    public void viewAllMaintenanceRecords() {
        if (maintenanceRecords.isEmpty()) {
            System.out.println("No maintenance records found.");
        } else {
            for (MaintenanceRecord record : maintenanceRecords) {
                System.out.println(record);
                System.out.println("-------------------------------");
            }
        }
    }

    // Other methods like updateMaintenanceRecord, deleteMaintenanceRecord can be added here
}

public class Main {
    public static void main(String[] args) {
        RealEstateManagementApp app = new RealEstateManagementApp();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== Real Estate Management Application =====");
            System.out.println("1. Add Maintenance Record");
            System.out.println("2. View All Maintenance Records");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter House Address: ");
                    String houseAddress = scanner.nextLine();
                    System.out.print("Enter Maintenance Type: ");
                    String maintenanceType = scanner.nextLine();
                    System.out.print("Enter Description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter Date: ");
                    String date = scanner.nextLine();

                    MaintenanceRecord newRecord = new MaintenanceRecord(houseAddress, maintenanceType, description, date);
                    app.addMaintenanceRecord(newRecord);
                    break;
                case 2:
                    app.viewAllMaintenanceRecords();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
