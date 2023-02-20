import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileReader {

    public FileReader(){
    }

    public void readFile(String filename){
        try(Scanner reader = new Scanner(Paths.get(filename))){
            while(reader.hasNextLine()){
                String row = reader.nextLine();
//                if(row.isEmpty()){
//                    continue;
//                }
                String[] tokens = row.split("\n");
                System.out.println(tokens[0]);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
