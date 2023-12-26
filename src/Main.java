import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


        public static Book newBook = new Book("xyz","xyxz","sdsd","sad",170) ;
        public   static  Member newMem = new Member("navneet","sdasd","12254122","asdasd") ;


    public static void main(String[] args) {


        System.out.println("Welcome to library");

        Library lib = new Library();
         while(true){
             System.out.println("Enter 1 to add book");
             System.out.println("Enter 2 to add member");
             System.out.println("Enter 3 to check out a book to member");
             System.out.println("Enter 4 to check in a book");
             System.out.println("Enter 5 exit");
             System.out.println("Enter 6 to display checkout book");
             System.out.println("Enter 7  display all over due ");
             System.out.println("Enter 8 display list of book");
             System.out.println("Enter 9 display list of member");

             Scanner sc =new Scanner(System.in) ;
             int op = sc.nextInt() ;
              sc.nextLine() ;


              switch (op){

                  case 1:
                      lib.addBook(newBook);
                       break ;
                  case 2:
                      lib.addMember(newMem);
                      break;
                  case 3:

                      Member m = newMem ;
                      lib.checkOut(m,newBook);
                      break;
                  case 4:
                      Member checkInBook = newMem;
                      Book toCheckInBook = newBook;
                      lib.checkInBook(toCheckInBook,checkInBook);
                      break;
                  case 5:
                      System.out.println("Thank you for using ");
                        return;
                  case 6:
                       lib.displayCheckoutBooks();
                      break ;
                  case 7:
                      lib.displayListOfAllOverDue();
                      break ;
                  case 8:
                      lib.displayListOfBook();
                      break;
                  case 9:
                      lib.displayListOfMember();
                      break ;
                  default:
                      System.out.println("Enter Valid option ");
                       break;

              }

         }


    }
}