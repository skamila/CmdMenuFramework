package skamila.cmdMenuFramework.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner;

    public ConsoleInput (){
        scanner = new Scanner(System.in);
    }

    @Override
    public String getInput () {
        return scanner.nextLine();
    }


}