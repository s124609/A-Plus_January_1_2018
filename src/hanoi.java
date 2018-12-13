import java.io.File;
import java.io.IOException;
import java.util.*;
import static java.lang.System.*;

public class hanoi
{
    public static void main (String[] args) throws IOException
    {
        Scanner file = new Scanner(new File("hanoi.dat"));
        file.nextInt();

        do {
            int n = file.nextInt();
            out.println((int)(Math.pow(2,n)) - 1);
        } while (file.hasNextInt());

    }
}