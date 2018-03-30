package skamila.cmdMenuFramework;
import skamila.cmdMenuFramework.menuEntry.MenuEntry;
import skamila.cmdMenuFramework.menuEntry.MenuEntryAction;
import skamila.cmdMenuFramework.menuEntry.MenuEntrySubmenu;
import skamila.cmdMenuFramework.menuPrinter.MenuPrinter;
import skamila.cmdMenuFramework.menuPrinter.MenuPrinterStandard;

import java.util.ArrayList;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Menu {

    private ArrayList<MenuEntry> menuEntries, activeMenu;
    private MenuPrinter printer;

    public Menu(ArrayList<MenuEntry> _menuEntries, MenuPrinter _printer){
        activeMenu = menuEntries = _menuEntries;
        printer = _printer;
        // dołożyć koniec + koniec w podmenu
    }


    public void doMenu (){

        printMenu();
        int choice;
        do {
            choice = getChoice();
            chooseEntry(choice);
        } while (activeMenu == menuEntries  && choice != menuEntries.size() - 1);

    }

    private void printMenu(){
        printer.print(activeMenu);
    }

    private void chooseEntry(int choice){
        if (activeMenu.get(choice) instanceof MenuEntryAction){
            ((MenuEntryAction) activeMenu.get(choice)).getAction().action();
        } else {
            activeMenu = ((MenuEntrySubmenu) activeMenu.get(choice)).getMenuEntries();
            printMenu();
        }
    }

    private int getChoice(){  // dorzucić wyjątki
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine()) - 1;
        return choice;
    }




}
