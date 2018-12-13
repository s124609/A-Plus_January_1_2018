import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class sort
{
    private static String[] pieces = {"K", "Q", "R", "H", "B", "P", "k", "q", "r", "h", "b", "P"};
    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("sort.dat"));
        file.nextLine();

        do {
            String[] line = file.nextLine().split(" ");

            ArrayList<String> list = new ArrayList<>();
            Collections.addAll(list, line);

            list.sort((o1, o2) -> position(o2) - position(o1));

            for (String temp : list)
            {
                out.print(temp);
            }
            out.print("\n");
        } while (file.hasNextLine());

    }

    private static int position (String find)
    {
        String test;
        int i = 0;
        do {
            test = sort.pieces[i];

            if (test.equals(find))
                return i;
            else i++;

        } while (i < pieces.length);

        return 0;
    }
}
