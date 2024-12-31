import java.util.Arrays;

public class Library {
  // A library has many books
  // A book has attributes, title & author
  // The library has functions
    // 1) add a Book, return void.
    // 2) removeByTitle, return Book.
    // 3) searchByTitle, return Book[].
  private Book[] books;

  public Library(){
    this.books = new Book[0];
  }

  public Book[] getBooks(){
    return this.books;
  }

  public void setbooks(Book[] books){
    this.books = books;
  }

 
  public Book[] searchByTitle(String title){
    int idx = 0;
    int length = 0;
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getBookTitle().contains(title)){
        length++;
      }
    }
    Book[] resultBook = new Book[length];
    for (int i = 0; i < this.books.length; i++){
      if (this.books[i].getBookTitle().contains(title)){
        resultBook[idx++] = this.books[i];
      }
    }
    return resultBook;
  }

  

  public static void main(String[] args) {
    // Library l1 = new Library();
    // l1.addBook(new Book("three Pigs", "Tom"));
    // for (Book book : l1.books){
    //   System.out.println(book.getBookTitle());
    // }

    // //System.out.println(Arrays.toString(l1.searchByTitle("three")));
    // for (Book book : l1.searchByTitle("ee")){
    //   System.out.println(book.getBookTitle());
    // }

    // l1.addBook(new Book("Four Pigs", "Tom"));
    // l1.addBook(new Book("Four Turtles", "Ken"));


    

    //l1.removeByTitle("Four");
    //System.out.println( l1.removeByTitle("Four").getBookTitle());
    // for (Book book : l1.books){
    //    System.out.println(book.getBookTitle());
    //  }

    // for (int i = 0; i < l1.searchByTitle("ig").length; i++){
    //   System.out.println(l1.searchByTitle("ig")[i].getBookTitle() + ", ");
    // }

    
  }
}
