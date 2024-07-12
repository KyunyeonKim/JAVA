package multi.java14;

import java.util.List;
import java.util.Scanner;

public class Main08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PersonDAO personDAO = new PersonDaoImpl();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Insert person");
            System.out.println("2. Update person");
            System.out.println("3. Delete person");
            System.out.println("4. Select person by ID");
            System.out.println("5. Select person by Name");
            System.out.println("6. Display all persons");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.println("Enter ID, Name, Age:");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    String name = scanner.nextLine();
                    int age = scanner.nextInt();
                    personDAO.insert(new PersonVO(id, name, age));
                    break;

                case 2:
                    System.out.println("Enter ID of person to update:");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter new Name and new Age:");
                    String newName = scanner.nextLine();
                    int newAge = scanner.nextInt();
                    personDAO.update(new PersonVO(updateId, newName, newAge));
                    break;

                case 3:
                    System.out.println("Enter ID of person to delete:");
                    int deleteId = scanner.nextInt();
                    personDAO.delete(deleteId);
                    break;

                case 4:
                    System.out.println("Enter ID of person to select:");
                    int selectId = scanner.nextInt();
                    PersonVO person = personDAO.select(selectId);
                    System.out.println("Selected: " + person);
                    break;

                case 5:
                    System.out.println("Enter Name of person to select:");
                    String selectName = scanner.nextLine();
                    PersonVO personByName = personDAO.select2(selectName);
                    System.out.println("Selected: " + personByName);
                    break;

                case 6:
                    List<PersonVO> allPersons = personDAO.selectAll();
                    for (PersonVO p : allPersons) {
                        System.out.println("Person: " + p);
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    }

