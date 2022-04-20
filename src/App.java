import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("briannaJUD.dat"));

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNext()) {

            list.add(Integer.parseInt(scanner.next()));
            Collections.sort(list);
        }

        System.out.print(list.get(0) + " ");
        System.out.print(list.get(list.size() - 1) + " ");
        System.out.println((list.get(list.size() - 1) - list.get(0)));
    }
}
