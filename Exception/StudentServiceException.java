package Exception;

public class StudentServiceException extends Exception {


        public static final String NO_STUDENT_FOUND = "No Student found in records";

        public StudentServiceException(String msg) {
            super(msg);
        }
    }
