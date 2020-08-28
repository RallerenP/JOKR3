import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws FileNotFoundException {

        Main m = new Main();

        m.displayRandom(m.getJokes());
    }

    private ArrayList<String> getJokes() throws FileNotFoundException {
        ArrayList<String> jokes = new ArrayList<>();

        Scanner sc = new Scanner(new File("jokes"));
        sc.useDelimiter("\\|");

        while (sc.hasNext())
        {
            jokes.add(sc.next());
        }

        return jokes;
    }

    private void displayRandom(ArrayList<String> strings)
    {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Wanna listen to a joke?\nIf yes, press enter.\n");
        scan.nextLine();

        boolean flag = true;
        while(flag) {
            int index = new Random().nextInt(strings.size());
            System.out.println(strings.get(index));
            //System.out.println("\nAnother one? We the best music! ENTERRRRRRRRRRR <3 ^^ O.o\n\n\n");
            scan.nextLine();
        }
    }
}