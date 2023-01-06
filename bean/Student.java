package bean;

public class Student {

    private int id;
    private int DOB;
    private int DOJ;
    private String name;
    private String school;
    private String department;
    private String subject;

    public Student(int id, int DOB, int DOJ, String name, String school, String department, String subject) {
        this.id = id;
        this.DOB = DOB;
        this.DOJ = DOJ;
        this.name = name;
        this.school = school;
        this.department = department;
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public int getDOJ() {
        return DOJ;
    }

    public void setDOJ(int DOJ) {
        this.DOJ = DOJ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return "StudentSummary{" +
                "id=" + id +
                ", DOB=" + DOB +
                ", DOJ=" + DOJ +
                ", name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", department='" + department + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
