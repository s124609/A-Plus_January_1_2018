import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class war
{
    private static int goal;
    private static String[] line;

    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("war.dat"));
        file.nextLine();

        do {
            goal = Integer.parseInt(file.nextLine());
            line = file.nextLine().split(" ");

            if (combination())
                out.println("HONOR");
            else
                out.println("DISHONOR");

        } while (file.hasNextLine());
    }

    private static boolean combination ()
    {
        int current = 0;

        for (int pos1 = 0; pos1 < line.length; pos1++) {
            for (int pos2 = pos1 + 1; pos2 < line.length; pos2++) {
                int test = current + Integer.parseInt(line[pos2]);

                if (test == goal)
                    return true;
                else if (!(test > goal))
                    current = test;
            }
        }

        return false;
    }
}