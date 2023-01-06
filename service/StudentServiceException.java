package service;

public class StudentServiceException extends Exception {

    public static final String No_Student_Found = "No Records Matched";

    public StudentServiceException(String msg) {
        super(msg);
    }
}
