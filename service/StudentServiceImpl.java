package service;

import bean.Student;
import utils.ReadUtils;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private List<Student> studentList;
    private ReadUtils m_readUtil;

    public StudentServiceImpl() {
        studentList = new ArrayList<>();
        m_readUtil = new ReadUtils();
    }

    @Override
    public void addNewStudent() {

        try {
            Student student = new Student();
            studentList.add(student);
        }
        catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
        catch (ClassCastException e) {
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> showAllStudentsInformation() throws StudentServiceException {

        if (studentList.size() == 0) {
            throw new StudentServiceException(StudentServiceException.No_Student_Found);
        }
        return studentList;
    }



}
