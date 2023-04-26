import java.util.*;
import java.util.stream.Collectors;

interface Class {
    public void addStudent(int id, String name, int age);

    public List<Students> getList();

    public void printData();

}

class Students implements Class {
    List<Students> list = new ArrayList<>();
    int id;
    String name;
    int age;

    public Students() {

    }

    private Students(int id, String name, int age) {
        this.age = age;
        this.id = id;
        this.name = name;
    }

    @Override
    public void addStudent(int id, String name, int age) {
        list.add(new Students(id, name, age));
    }

    @Override
    public List<Students> getList() {
        return this.list;
    }

    @Override
    public void printData() {

        list.stream().forEach(s -> System.out.println(s.id + " " + s.name + " " + s.name));
    }
}

/**
 * StreamsEx
 */
public class StreamsEx {

    public static void main(String[] args) {
        Class c = new Students();
        c.addStudent(1, "kiran", 17);
        c.addStudent(2, "anil", 24);
        c.addStudent(3, "narendra", 23);
        c.addStudent(4, "mahesh", 23);

        (c).printData();

        c.getList().stream().filter(s -> s.name.contains("kiran")).collect(Collectors.toList())
                .forEach(s -> System.out.println(s.id + " " + s.age + " " + s.name));

    }

}
