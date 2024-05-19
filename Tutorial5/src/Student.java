import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int idCounter = 1;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String birthDate;
    private String indexNumber;
    private String status;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private List<Grade> grades;

    public Student(String firstName, String lastName, String email, String address, String birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.indexNumber = "s" + idCounter++;
        this.status = "kandydat";
        this.currentSemester = 1;
        this.grades = new ArrayList<>();
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    // Methods
    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.currentSemester = 1;
        this.status = "student";
    }

    public void addGrade(int value, String subject) {
        grades.add(new Grade(value, subject));
    }

    public void promoteToNextSemester() {
        int failCount = 0;
        for (Grade grade : grades) {
            if (grade.getValue() < 3) {
                failCount++;
            }
        }

        if (failCount <= studyProgramme.getMaxFailsBeforePromotion()) {
            if (currentSemester < studyProgramme.getTotalSemesters()) {
                currentSemester++;
                if (currentSemester == studyProgramme.getTotalSemesters()) {
                    status = "absolwent";
                }
            }
        }
    }
}
