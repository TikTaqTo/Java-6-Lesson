
package Task28;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String text = in.nextLine();
        miniCalculator(text);
    }

    public static void miniCalculator(String text) {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object result = engine.eval(text);
            System.out.println(result);
        }catch (ScriptException e){
            e.printStackTrace();
        }
    }
}

