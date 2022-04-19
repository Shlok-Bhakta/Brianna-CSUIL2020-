import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("brianna.dat"));
        int pos = 0;
        while(scanner.hasNext()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(Integer.parseInt(scanner.next()));
         // list.sort();



        }

    }
}
