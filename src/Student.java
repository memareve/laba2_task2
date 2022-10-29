public class Student {
    protected int number;
    protected String name;
    protected String lastName;
    protected int age;
    protected double averageScore;

    public Student(int number, String name, String lastName, int age, double averageScore) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageScore = averageScore;
    }

    public void printInfo(Student student) {
        System.out.println("Номер зачетной книжки: " + student.number + "\n"  + "Имя: " + student.name + "\n"
                + "Фамилия: " + student.lastName + "\n" + "Возраст: " + student.age + "\n"
                + "Средний балл: " + student.averageScore + "\n");
    }
}
