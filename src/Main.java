public class Main{
    public static void main(String[] args){
        Student student = new Student(1, "Student", "Studentovich", 20, 4.1 );
        Student student1 = new Student(2, "Maria", "Evdischenko", 20, 3 );
        Student student2 = new Student(3, "Polina", "Braer", 21, 5 );
        Student student3 = new Student(4, "Ivan", "Ivanov", 20, 4 );
        Student student4 = new Student(5, "Denis", "Ivanov", 20, 4.2 );

        Group group = new Group();
        group.groupNumber = "20704";
        group.addStudent(student);
        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);

        group.deleteStudent(student4);
        student.printInfo(group.getByNumber(2));
        System.out.println(group.getCountByAge());
        System.out.println(group.getByMinScore(4.1) + "\n");
        group.printInfo();
        System.out.println(group.groupList.size());
        System.out.println(group.getAll());


    }
}