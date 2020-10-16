/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardcatalog;


/**
 *
 * @author 1styrGroupB
 */

// This is our Card Catalog Card 
/// The Comparable implemented by This class is use for sorting 
/// since it's a list we cannot sort it directly.
public class CardCatalog implements Comparable<CardCatalog> {

    
    private String cardID;
    private String bookTitle;
    private String bookAuthor;
    private String yearPublished;
    private String publisher;

    // getters and setters and constructors
    
    public String getcardID(){
        return cardID;
                
    }
    public void setCardId(String cardId) {
        this.cardID = cardId;
    }
    
    public String getBookTitle() {
        return bookTitle;
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
    
    
    public String getBookAuthor(){
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor){
        this.bookAuthor = bookAuthor;
    }
    
    public String getYearPublished(){
        return yearPublished;
    }
    public void setYearPublished(String yearPublished){
        this.yearPublished = yearPublished;
    }
    
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    //this is for sorting
    @Override
    public int compareTo(CardCatalog o) {
      return this.getcardID().compareTo(o.getcardID());
    }


}
