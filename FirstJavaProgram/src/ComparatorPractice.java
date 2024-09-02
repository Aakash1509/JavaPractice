import java.util.*;

class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorPractice {
    public static void main(String[] args) {

        //If I want to do custom sort , I can override compare method present in Comparator interface
        /*
        Comparator<Integer>com = new Comparator<Integer>() {
            @Override
            public int compare(Integer i , Integer j) {
                if(i%10 > j%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
         */
        Comparator<Student>com = new Comparator<Student>() {
            @Override
            public int compare(Student i , Student j) {
                if(i.age%10 > j.age%10){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };
        /*
        List<Integer> l = new ArrayList<>();
        l.add(33);
        l.add(41);
        l.add(58);
        l.add(29);
        Collections.sort(l,com);
        System.out.println(l);

         */
        List<Student>studs = new ArrayList<>();
        studs.add(new Student(21,"Navin"));
        studs.add(new Student(20,"Aakash"));
        studs.add(new Student(22,"Dhruv"));
        studs.add(new Student(23,"Rahul"));
        Collections.sort(studs,com);
        for(Student s : studs){
            System.out.println(s);
        }
    }
}
