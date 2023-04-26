import javax.script.*;

interface Fun {
    int add(int a, int b);
}

public class LambdaEx {
    public static void main(String[] args) throws ScriptException {
        Runnable r = () -> {
            System.out.println("done");
        };
        r.run();
        Fun fun = (a, b) -> {
            return a + b;
        };
        System.out.println(fun.add(1, 0));
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
        bind.put("name", "Nashorn");
        ee.eval("print('hi')");
    }

}
