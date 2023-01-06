package service;

public class StudentServiceException extends Exception {

    public static final String No_Student_Found = "No Student found in records";

    public StudentServiceException(String msg) {
        super(msg);
    }
}
