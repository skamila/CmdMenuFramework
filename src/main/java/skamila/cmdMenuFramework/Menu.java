package skamila.cmdMenuFramework;

import skamila.cmdMenuFramework.input.Input;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;
import skamila.cmdMenuFramework.menuEntry.MenuEntrySubmenu;
import skamila.cmdMenuFramework.menuPrinter.MenuPrinter;
import skamila.cmdMenuFramework.menuView.DataExtractor;
import skamila.cmdMenuFramework.menuView.MenuView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private ArrayList<MenuEntry> menuEntries, activeMenu;
    private MenuView menuView;
    private DataExtractor<ArrayList<MenuEntry>> dataExtractor;
    private MenuPrinter printer;
    private Input input;

    public Menu(ArrayList<MenuEntry> menuEntries, MenuView menuView, DataExtractor<ArrayList<MenuEntry>> dataExtractor, MenuPrinter printer, Input input) {
        this.activeMenu = menuEntries;
        this.menuView = menuView;
        this.dataExtractor = dataExtractor;
        this.printer = printer;
        this.input = input;
    }

    public void doMenu() {

        int choice;
        do {
            printMenu();
            choice = getChoice();
            chooseEntry(choice);
        } while (activeMenu == menuEntries && choice != menuEntries.size() - 1);

    }

    private void printMenu() {
        printer.print(menuView.generate(dataExtractor.extract(activeMenu)));
    }

    private void chooseEntry(int choice) {
        if (activeMenu.get(choice) instanceof MenuEntryAction) {
            doAction(choice);
        } else {
            chooseSubmenu(choice);
        }
    }

    private void doAction (int choice){
        ((MenuEntryAction) activeMenu.get(choice)).getAction().action();
        System.out.print("Naciśnij enter, aby kontynuować i powrócić do menu.");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void chooseSubmenu (int choice){
        activeMenu = ((MenuEntrySubmenu) activeMenu.get(choice)).getMenuEntries();
    }

    private int getChoice() {

        String stringChoice;
        int choice = 0;

        boolean ifContinue = true;
        do {
            try {
                stringChoice = input.getInput();
                choice = Integer.parseInt(stringChoice);
                if (choice < 1 || choice >= activeMenu.size()) throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Nie wpisałeś poprawnej liczby! Wybierz number od 1 do " + activeMenu.size());
                continue;
            }
            ifContinue = false;
        } while (ifContinue);
        return choice - 1;
    }


}
