package service;

import bean.Student;

import java.util.List;

public interface IStudentService {
    void addNewStudent(Student student);
    List<Student> showAllStudentsInformation() throws StudentServiceException;
}
