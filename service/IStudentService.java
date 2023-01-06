package service;

import bean.Student;

import java.util.List;

public interface IStudentService {
    void addNewStudent();
    List<Student> showAllStudentsInformation() throws StudentServiceException;
}
