import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private FileReader fr;
    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.fr = new FileReader();
    }

    public void menu(){
        System.out.print("File to read:");
        String file = this.scanner.nextLine();
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        String command = "";
        while(!(command.equals("stop"))){
            System.out.print("Enter command:");
            command = this.scanner.nextLine();
            if(command.equals("list")){
                fr.readFile(file);
            }
        }
    }
}
