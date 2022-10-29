import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    protected String groupNumber;
    protected ArrayList<Student>  groupList = new ArrayList<>();

    public void addStudent(Student student) {
        groupList.add(student);
    }

    public Student getByNumber(int serialNumber) {
        for (Student student : groupList) {
            if (student.number == serialNumber) {
                return student;
            }
        }
        return null;
    }
    public void deleteStudent(Student student) {
        groupList.remove(student);
    }
    public ArrayList<Student> getAll() {
            return new ArrayList<>(groupList);
    }
    public Map<Integer  , Integer> getCountByAge() {
        Map<Integer, Integer> ageAndStud = new HashMap<>();
        for (Student student : groupList) {
                int n = 0;
                for (Student stud: groupList){
                    if (stud.age == student.age){
                        n += 1;
                    }
                }
                ageAndStud.put(student.age,n);
        }
        return ageAndStud;
    }
    public List<Student> getByMinScore(double score) {
        List<Student> studentsScoreList = new ArrayList<>();
        for(Student student : groupList){
            if (student.averageScore >= score){
                studentsScoreList.add(student);
            }
        }
        return studentsScoreList;
    }
    public void printInfo(){
        System.out.println("Группа " + groupNumber + "\n" + "Состав студентов группы: " + "\n");
        for (Student student : groupList){
            student.printInfo(student);
        }
    }
}
