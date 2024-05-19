public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "1980-01-01");
        Student s2 = new Student("Kuba", "Werulik", "wrl@wp.pl", "Warsaw, Piękna 12", "1999-01-01");
        Student s3 = new Student("Anna", "Kowalska", "anna@wp.pl", "Krakow, Krótka 3", "2000-02-02");

        Students.addStudent(s1);
        Students.addStudent(s2);
        Students.addStudent(s3);

        StudyProgramme itProgramme = new StudyProgramme("IT", "Program studiów informatycznych", 7, 5);

        s1.enrollStudent(itProgramme);
        s2.enrollStudent(itProgramme);
        s3.enrollStudent(itProgramme);

        s1.addGrade(5, "PGO");
        s1.addGrade(2, "APBD");

        s2.addGrade(2, "PGO");
        s2.addGrade(2, "APBD");
        s2.addGrade(2, "ZPR");
        s2.addGrade(2,"ISZ");
        s2.addGrade(2,"BAZ2");
        s2.addGrade(2, "TIF");

        s3.addGrade(4, "PGO");
        s3.addGrade(3, "APBD");

        Students.promoteAllStudents();

        Students.displayInfoAboutAllStudents();
    }
}
