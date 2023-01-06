package uiservice;

import bean.Student;

import java.util.List;

public interface IStudentUiService {

    void addNewStudent();
    void showAllStudents();
    void showAllStudentsInformation();

    List<Student> searchStudentById(String id);

    List<Student>searchStudentByName(String name);


}
