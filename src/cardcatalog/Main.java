/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcatalog;
import java.util.*;

/**
 *
 * @author 1styrGroupB
 */
public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        
        //we create a new class object here
        // new keyword is ude to construct new instance
        // of app class
        App app = new App();
        
         while (true) {
            switch (app.choice()) {
                case "1":
                    app.addCard(); // we call the addCard method in App class
                    break;
                case "2":
                    app.editCard(); //we call ediCard in the App class
                    break;
                case "3":
                    app.removeCard(); // we call the removeCard in the App class
                    break;

                case "4":
                    switch (app.viewChoices()){ // refers to the veiwChoices method
                        case "1":
                            app.viewOneCard(); // viewOneCard method
                            break;
                        case "2":
                            app.viewListCard(); // viewListCard Method
                            break;
                    }       
                    break;
                default:
                    System.out.println("Invalid Input!!");
            }
        }
    }

    
}
