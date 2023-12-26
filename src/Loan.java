import java.time.LocalDate;
import java.util.Date;

public class Loan {

   private    Book book ;
   private  Member member ;
   private LocalDate date ;

    public Loan(Book book, Member member, LocalDate date) {
        this.book = book;
        this.member = member;
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
