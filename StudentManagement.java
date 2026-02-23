class StudentManagement {

    static class Student {
        String studentName;
        int studentId;
        int studentClass;
        String studentSchoolName;
        String studentNative;
    }

    public static void main(String[] args) {

        Student s1 = new Student();   

        s1.studentName = "Arun";
        s1.studentId = 101;
        s1.studentClass = 10;
        s1.studentSchoolName = "ABC School";
        s1.studentNative = "Bangalore";
		
		s1.studentName="Arun Kumar";
		s1.studentNative="Chikkamagaluru";
		
        System.out.println("Name: " + s1.studentName);
        System.out.println("ID: " + s1.studentId);
        System.out.println("Class: " + s1.studentClass);
        System.out.println("School: " + s1.studentSchoolName);
        System.out.println("Native: " + s1.studentNative);
    }
}