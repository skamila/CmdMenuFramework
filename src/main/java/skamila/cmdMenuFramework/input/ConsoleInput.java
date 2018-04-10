package skamila.cmdMenuFramework.input;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private Scanner scanner;

    public ConsoleInput (Scanner scanner){
        this.scanner = scanner;
    }

    @Override
    public String getInput () {
        return scanner.nextLine();
    }


}