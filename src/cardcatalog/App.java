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
public class App {

    Scanner input = new Scanner(System.in);
    // initializing our Array list
    ArrayList<CardCatalog> cat = new ArrayList<>();

    public String choice() {

        System.out.println("Card Catalog options\n1 - Add Card\n2 - Edit Card\n3 - Remove Card\n4 -View Card/s");
        System.out.println("Choice: ");
        String choice = input.nextLine();

        return choice;

    }
    //In this method we added a new card
    public void addCard() {
        if (!cat.isEmpty()) {    

            CardCatalog card = new CardCatalog();
            

            System.out.println("Card ID: ");
            card.setCardId(input.nextLine());

            System.out.println("Book Title: ");
            card.setBookTitle(input.nextLine());

            System.out.println("Book Author: ");
            card.setBookAuthor(input.nextLine());

            System.out.println("Year Published: ");
            card.setYearPublished(input.nextLine());

            System.out.println("Publisher: ");
            card.setPublisher(input.nextLine());
            System.out.println("");
            

            cat.add(card);

            System.out.println("Card Succesfully Added!");
        } else {
            System.out.println("Card is Empty!");
        }

    }
    // Edit Card by finding the card id
    public void editCard() {
        if (!cat.isEmpty()) {   // checking if our card is not empty
            System.out.println("Enter Id:");
            String userInput = input.nextLine();
            
            // We use forEach to scan what is inside our list
            cat.forEach((list) -> {
                if (userInput.equals(list.getcardID())) {

                    System.out.println("Book Id: " + list.getcardID());
                    System.out.println("Book Title: " + list.getBookTitle());
                    System.out.println("Book Author: " + list.getBookAuthor());
                    System.out.println("Year Published: " + list.getYearPublished());
                    System.out.println("Publisher: " + list.getPublisher());
                    System.out.println("");

                    System.out.println("Card ID: ");
                    list.setCardId(input.nextLine());

                    System.out.println("Book Title: ");
                    list.setBookTitle(input.nextLine());

                    System.out.println("Book Author: ");
                    list.setBookAuthor(input.nextLine());

                    System.out.println("Year Published: ");
                    list.setYearPublished(input.nextLine());

                    System.out.println("Publisher: ");
                    list.setPublisher(input.nextLine());

                }
            });
            System.out.println("Succesfully Edited!");
        } else {
            System.out.println("Card is Empty");
            System.out.println("");
        }

    }

    //Method to remove card from the list
    public void removeCard() {
        System.out.println("Enter Id:");
        String userInput = input.nextLine();
        CardCatalog object = null;
        for (CardCatalog card : cat) {

            // condition of compare if user iputed id can be found 
            // in our list or to simply it is in the list
            if (userInput.equals(card.getcardID())) {
                System.out.println("Book Id: " + card.getcardID());
                System.out.println("Book Title: " + card.getBookTitle());
                System.out.println("Book Author: " + card.getBookAuthor());
                System.out.println("Year Published: " + card.getYearPublished());
                System.out.println("Publisher: " + card.getPublisher());
                System.out.println("");
                object = card;
                break;
            }

        }
        if (cat.remove(object)) {
            System.out.println("Succesfully Removed");

        } else {
            System.out.println("Not Found");
            System.out.println("");

        }

    }

    // Here we created a choice  method where the users can have the choice to 
    //   veiw one card or all the list of card.
    public String viewChoices() {
        System.out.println("Enter 1 to View One Card"); // to view once card
        System.out.println("Enter 2 to Veiw All Card"); // to view all the card
        System.out.println("Enter Choice: ");
        String userChoice = input.nextLine();

        return userChoice;
    }
    // method for viewing one card only!
    public void viewOneCard() {
        if (!cat.isEmpty()) {
            System.out.println("Enter Id:");
            String userInput = input.nextLine();
            cat.forEach((list) -> {
                if (userInput.equals(list.getcardID())) {
                    System.out.println("Book Id: " + list.getcardID());
                    System.out.println("Book Title: " + list.getBookTitle());
                    System.out.println("Book Author: " + list.getBookAuthor());
                    System.out.println("Year Published: " + list.getYearPublished());
                    System.out.println("Publisher: " + list.getPublisher());
                    System.out.println("");
                }

            });
        } else {
            System.out.println("Card is Empty or does not Exist!");
        }

    }

    // mthod for viewing all the list of card
    public void viewListCard() {
        if (!cat.isEmpty()) {
            Collections.sort(cat);
            cat.forEach((list) -> {
                System.out.println("Book Id: " + list.getcardID());
                System.out.println("Book Title: " + list.getBookTitle());
                System.out.println("Book Author: " + list.getBookAuthor());
                System.out.println("Year Published: " + list.getYearPublished());
                System.out.println("Publisher: " + list.getPublisher());
                System.out.println("");
            });
        } else {
            System.out.println("Card Catalog is Empty!");
        }

    }
    
}
