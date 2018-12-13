import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class yes
{
    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("yes.dat"));
        file.nextLine();

        do {
            int total = Integer.parseInt(file.nextLine());
            int y = 0;
            int n = 0;

            for (int i = 0; i < total; i++) {
                String line = file.nextLine();

                if (line.contains("caesar")) {
                    if (line.indexOf('Y') > -1) {
                        out.println("YES");
                        y = -1;
                        break;
                    }
                    if (line.indexOf('N') > -1) {
                        out.println("NO");
                        n = -1;
                        break;
                    }
                }
                else
                {
                    if (line.indexOf('Y') > -1)
                        y++;
                    if (line.indexOf('N') > -1)
                        n++;
                }

            }
            if (y == -1 || n == -1)
                out.print("");
            else if (y > n)
                out.println("YES");
            else
                out.println("NO");

        } while (file.hasNextLine());

    }
}