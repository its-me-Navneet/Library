import javax.xml.crypto.Data;
import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Library {

    public  ArrayList<Book> liOfBook = new ArrayList<>() ;
    public  ArrayList<Member> liOfMember = new ArrayList<Member>() ;
    public HashMap<Book, Loan>checkOutBooks = new HashMap<>() ;
    public HashMap<Book,Integer>availableBook = new HashMap<>() ;
    public HashMap<Member,Integer>registeredMember = new HashMap<>() ;


     public void addBook(Book b){
          liOfBook.add(b) ;
          availableBook.put(b,1) ;
         System.out.println("Book added Successfully");
     }
     public void addMember(Member p){
          liOfMember.add(p) ;
         System.out.println("Member added");
     }

     public void checkOut(Member m,Book b){


          if(!liOfMember.contains(m)){
              System.out.println("You are not registered");
               return;
          }

         if(availableBook.containsKey(b)){
              LocalDate today = LocalDate.now();
              LocalDate overdue =today.plusDays(30) ;
             Loan loan  = new Loan(b,m,overdue) ;
             checkOutBooks.put(b,loan) ;
             availableBook.remove(b) ;
             System.out.println("Thank you for using our service");
         }
         else{
             System.out.println("Book is not available ");
              return;
         }


    }
    public void checkInBook(Book b,Member m){

         if(checkOutBooks.containsKey(b)){
             Loan l =(Loan) checkOutBooks.get(b) ;
             LocalDate dateOfCheckOut = l.getDate();
             LocalDate datOfCheckIn = LocalDate.now() ;
             long daysDifference = ChronoUnit.DAYS.between(datOfCheckIn, dateOfCheckOut);
             checkOutBooks.remove(b) ;
             availableBook.put(b,1) ;

             System.out.println("Checked in ");
             System.out.println(" days difference between submission is "+ daysDifference);

         }
         else{
             System.out.println("Book is not alloted from here");
         }

    }

    public void displayListOfBook(){

         for(Book b: liOfBook){
             System.out.println(b);
         }
    }
    public void displayListOfMember(){

         for(Member m : liOfMember){
             System.out.println(m);
         }
    }
    public void displayCheckoutBooks(){

        Iterator hash = checkOutBooks.entrySet().iterator() ;

        while(hash.hasNext()){
            Map.Entry mapElement = (Map.Entry)hash.next() ;
            System.out.println(mapElement.getKey());
        }
    }
    public void displayListOfAllOverDue(){

        Iterator hash = checkOutBooks.entrySet().iterator() ;

        while(hash.hasNext()){
            Map.Entry mapElement = (Map.Entry)hash.next() ;
           Loan loan = (Loan) mapElement.getValue() ;
           LocalDate givenDate = loan.getDate() ;
           LocalDate today = LocalDate.now();
            if (today.isAfter(givenDate)) {
                System.out.println(loan);
            }
        }

    }





}
