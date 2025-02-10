import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class RoundRobinReader {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "data.txt";
        Scanner file = new Scanner(new File(filename));
        int processNum = Integer.parseInt(file.nextLine());
        int quantumLength = Integer.parseInt(file.nextLine());
        Queue<Process> processQueue = new LinkedList<>();
        while(file.hasNextLine()) {
            String[] line = file.nextLine().split(",");
            processQueue.add(new Process(Integer.parseInt(line[0]),line[1],Integer.parseInt(line[2])));
        }
        file.close();

        System.out.println(processQueue);
    }

}