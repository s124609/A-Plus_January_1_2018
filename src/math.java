import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class math
{
    public static void main (String[] args) throws IOException, ScriptException
    {
        Scanner file = new Scanner(new File("math.dat"));
        file.nextLine();

        do {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("JavaScript");

            String x = engine.eval(file.nextLine()).toString();
            Double answer = Double.parseDouble(x);
            out.printf("%.2f\n",answer);
        } while (file.hasNextLine());

    }
}
