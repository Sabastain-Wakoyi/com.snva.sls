package service;

import bean.Student;
import utils.ReadUtils;
import java.util.List;

public class StudentServiceImpl implements IStudentService {
    private List<Student> studentList;
    private ReadUtils m_readUtil;


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

        if (studentList.size() == 1) {
            throw new StudentServiceException(StudentServiceException.No_Student_Found);
        }
        return studentList;
    }



}
