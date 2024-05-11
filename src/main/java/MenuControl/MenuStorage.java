/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MenuControl;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author MY PC
 */
public class MenuStorage {
    private String message;
    private List<Integer> options;
    private List<String> optionsMessage;
    private List<Menu> optionsLinking;
    Menu main = new Menu();
    Menu subMenu1 = new Menu();
    Menu subMenu2 = new Menu();
    
    public MenuStorage(){
        this.options = new ArrayList<>();
        this.optionsMessage = new ArrayList<>();
        this.optionsLinking = new ArrayList<>();
        initStorage();
    }
    
    public void initStorage(){
        this.message = "Main menu";
        this.options.add(1);
        this.options.add(2);
        this.optionsMessage.add("Sub menu 1");
        this.optionsMessage.add("Sub menu 2");
        System.out.println(this.options.size());
        this.main.setMessage(message);
        this.main.setOptions(options);
        this.main.setOptionsMessage(optionsMessage);
        
        this.message = "Sub menu 1";
        this.options.clear();
        this.optionsMessage.clear();
        this.subMenu1.setMessage(message);
        this.subMenu1.setOptions(options);
        this.subMenu1.setOptionsMessage(optionsMessage);
        this.subMenu1.setOptionsLinking(optionsLinking);
        
        this.message = "Sub menu 2";
        this.subMenu2.setMessage(message);
        this.subMenu2.setOptions(options);
        this.subMenu2.setOptionsMessage(optionsMessage);
        this.subMenu2.setOptionsLinking(optionsLinking);
        
        this.optionsLinking.add(this.subMenu1);
        this.optionsLinking.add(this.subMenu2);
        this.main.setOptionsLinking(optionsLinking);
    }
    
    public void run(){
        main.execute();
    }
}
