package runner;


import bean.Student;
import uiservice.IStudentUiService;
import uiservice.StudentUiService;
import utils.ReadUtils;

import java.util.ArrayList;
import java.util.List;


public class Runner {

    private final ReadUtils m_readUtils;
    private final IStudentUiService m_StudentUiService;

    public Runner() {
        m_readUtils = new ReadUtils();
        m_StudentUiService = new IStudentUiService() {
            @Override
            public void addNewStudent() {

            }

            @Override
            public void showAllStudents() {

            }

            @Override
            public List<Student> searchStudentById(String id) {
                return null;
            }

            @Override
            public List<Student> searchStudentByName(String id) {
                return null;
            }
        };
        checkUserOptions();
    }

    private void checkUserOptions() {

        int choice = 0;
        List<Student> studentList = new ArrayList<>();

        do {
            displayMainMenu();
            choice = m_readUtils.readInt("Input your choice", "Enter valid choice");
            switch (choice) {
                case 1:
                    m_StudentUiService.addNewStudent();
                    break;
                case 2:
                    m_StudentUiService.showAllStudents();
                    break;
                case 3:
                    String id = m_readUtils.readString("enter Student Id", "input can not be empty");
                    try {
                        m_StudentUiService.searchStudentById(id);
                        System.out.println();
                    }
                    catch (NullPointerException e) {
                        System.out.println("Student not found");
                    }
                    break;
                case 4:
                    String name = m_readUtils.readString("Enter Student Name",
                            "Enter a Valid Option");
                    try {
                        m_StudentUiService.searchStudentByName(name);
                        System.out.println();
                    }
                    catch (NullPointerException e) {
                        System.out.println("Student not found");
                    }
                    break;
                case 5:
                    System.out.println("  ");
                    break;
                default:
                    System.out.println("Wrong Option");
                    break;
            }
        }
        while (choice != 5);
    }

    private void displayMainMenu()
    {
        System.out.println("==========Main Menu==========");
        System.out.println("1. Add New Student ");
        System.out.println("2. View all Students ");
        System.out.println("3. View Student by Id ");
        System.out.println("4. View student by Name");
        System.out.println("5. Exit ");
        System.out.println("===========End Menu===========");
    }

    public static void main(String[] args) {
        new Runner();
    }
}








