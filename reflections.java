import java.util.*;;

public class reflections {
    int add(int a, int b) {
        return a + b;
    }

    String getDetails(List<Integer> id, List<String> names) {
        return id.stream().toString() + " " + names.stream().toString();

    }
}
