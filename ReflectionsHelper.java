import java.lang.reflect.*;

public class ReflectionsHelper {
    public static void main(String[] args) {
        reflections ref = new reflections();
        java.lang.Class<? extends reflections> c = ref.getClass();
        Method[] m = c.getDeclaredMethods();
        for (Method method : m) {
            for (Parameter parameter : method.getParameters()) {
                System.out.println(parameter.getParameterizedType());
            }
        }

    }
}
