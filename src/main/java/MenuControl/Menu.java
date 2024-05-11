/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author MY PC
 */
public class Menu {
    private String message;
    private List<Integer> options;
    private List<String> optionsMessage;
    private List<Menu> optionsLinking;
    private Menu prevMenu = null;

    public Menu() {
    }
    
    public Menu(String message, List<Integer> options, List<String> optionsMessage, List<Menu> optionsLinking){
        this.message = message;
        this.options = new ArrayList<>(options);
        this.optionsMessage = new ArrayList<>(optionsMessage);
        this.optionsLinking = new ArrayList<>(optionsLinking);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Integer> getOptions() {
        return options;
    }

    public void setOptions(List<Integer> options) {
        this.options = new ArrayList<>(options);
    }

    public List<String> getOptionsMessage() {
        return optionsMessage;
    }

    public void setOptionsMessage(List<String> optionsMessage) {
        this.optionsMessage = new ArrayList<>(optionsMessage);
    }

    public List<Menu> getOptionsLinking() {
        return optionsLinking;
    }

    public void setOptionsLinking(List<Menu> optionsLinking) {
        this.optionsLinking = new ArrayList<>(optionsLinking);
    }

    
    
    public Menu getPrevMenu() {
        return prevMenu;
    }

    public void setPrevMenu(Menu prevMenu) {
        this.prevMenu = prevMenu;
    }
    
    public void display(){
        System.out.println(this.message);
        if(this.options.size() != 0){
            var ref = new Object(){
                int counter = 1;
            };
            optionsMessage.forEach(Message -> {
                System.out.println(Integer.toString(ref.counter) + ". " + Message);
                ref.counter++;
            });
        }
        if(this.prevMenu != null){
            System.out.println("0. " + "Tro ve");
        }
    }
    
    public int getOption(){
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.print("Vui long nhap lua chon: ");
        option = scanner.nextInt();
        int min;
        if(this.prevMenu != null){
            min = 0;
        }
        else{
            min = 1;
        }
        while(option < min & option > this.options.size() - 1){
            System.out.print("Lua chon khong kha thi! Vui long nhap lai.");
            System.out.print("Vui long nhap lua chon: ");
            option = scanner.nextInt();
        }
        return option;
    }
    
    public void execute(){
        display();
        int option = getOption();
        if(option == 0){
            this.prevMenu.execute();
        }
        else{
            this.optionsLinking.get(option - 1).setPrevMenu(this);
            this.optionsLinking.get(option - 1).execute();
        }
    }
}
