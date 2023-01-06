package uiservice;

import bean.Student;
import service.IStudentService;
import service.StudentServiceImpl;
import utils.ReadUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentUiService implements IStudentUiService  {
    private ReadUtils m_readUtils;
    private IStudentUiService m_istudentUiService;

    public StudentUiService() {
        m_readUtils = new ReadUtils();
        m_istudentUiService = new StudentUiService();
    }

    @Override
    public void addNewStudent() {
        Student student = new Student();
        student.setId(m_readUtils.readInt("enter your id", "Don't leave empty"));
        student.setName(m_readUtils.readString("enter name", " can not be empty"));
        student.setDepartment(m_readUtils.readString("enter your department", "can not be empty"));
        student.setSchool(m_readUtils.readString("enter the name of your school", "can not be empty!"));
        student.setDOB(m_readUtils.readInt("enter your date of birth", " can not be empty!"));
        student.setDOJ(m_readUtils.readInt("Enter the Date you joined your school", "can not be empty!"));
        student.setSubject(m_readUtils.readString("Enter your subject", "can not be empty!"));
        m_istudentUiService.addNewStudent(student);
    }

    @Override
    public void showAllStudents() {

        try {
            List<Student> studentList = m_istudentUiService.showAllStudentsInformation();
            System.out.println("All Student Information: \n");
            printList(studentList);
        }
        catch (StudentServiceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> searchStudentById(String id) {
        List<Student> studentList = null;

        try {
            List<Student> allStudentList = m_istudentUiService.showAllStudentsInformation();
            studentList = new ArrayList<>();
            Iterator<Student> studentIterator = allStudentList.listIterator();
            while (studentIterator.hasNext()) {
                Student student = studentIterator.next();
                if (student.getId().equals(id)) {
                    studentList.add(student);
                }
            }
            printList(studentList);
        }
        catch (StudentServiceException e) {
            System.out.println(e.getMessage());
        }
        if (studentList == null || studentList.size() == 0) {
            throw new NullPointerException();
        }
        return studentList;
    }

    @Override
    public List<Student> searchStudentByName(String name) throws NullPointerException {
        List<Student> studentList = null;

        try {
            name = name.toLowerCase();
            List<Student> allStudentList = m_istudentUiService.showAllStudentsInformation();
            studentList = new ArrayList<>();
            Iterator<Student> studentIterator = allStudentList.listIterator();
            while (studentIterator.hasNext()) {
                Student student = studentIterator.next();
                String Name = (student.getName() + " " + student.getName());
                if (Name.contains(name)) {
                    studentList.add(student);
                }
            }
            printList(studentList);
        }
        catch (StudentServiceException e) {
            System.out.println(e.getMessage());
        }
        if (studentList == null || studentList.size() == 0) {
            throw new NullPointerException();
        }
        return studentList;
    }

    private void printList(List<Student> studentList) {

        for (Student student : studentList) {
            System.out.println("=========================================");
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student ID: " + student.getDOB());
            System.out.println("Student ID: " + student.getDOJ());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Department: " + student.getDepartment());
            System.out.println("Student Subject: " + student.getSubject());
            System.out.println("Student School: " + student.getSchool());
            System.out.println("=========================================");
            System.out.println();
        }
    }
}