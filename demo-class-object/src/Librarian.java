public class Librarian {
  private Library library;


  public Librarian(Library library){
    this.library = library;
  }

  public void addBook(Book book){
    Book[] newBooks = new Book[this.library.getBooks().length + 1];
    for (int i = 0; i < this.library.getBooks().length; i++){
      newBooks[i] = this.library.getBooks()[i];
    }
    newBooks[newBooks.length - 1] = book;
    this.library.setbooks(newBooks);
  }

  public Book removeByTitle(String title){
    Book removedBook = null;
    int length = this.library.getBooks().length;
    for (int i = 0; i < this.library.getBooks().length; i++){
      if (this.library.getBooks()[i].getBookTitle().contains(title)){
        removedBook = this.library.getBooks()[i];
        length -= 1;
        break;
      }
    }
    Book[] newBooks = new Book[length];
    int idx = 0;
    for (int i = 0; i < this.library.getBooks().length; i++){
      if (this.library.getBooks()[i] == removedBook){
        
        continue;
      }else {
        newBooks[idx++] = this.library.getBooks()[i];
      }
    }
    this.library.setbooks(newBooks);

    if (removedBook == null){
      System.out.println("Cannot find the book.");
    }else {
      System.out.println("removed: " + removedBook.getBookTitle());
    }
    return removedBook;
  }

  public static void main(String[] args) {
    Library l1 = new Library();
    Librarian librarian = new Librarian(l1);

    Book b1 = new Book("Three pigs", "Tom");
    Book b2 = new Book("Four turtles", "chan");

    librarian.addBook(b1);
    librarian.addBook(b2);

    librarian.removeByTitle("Three pigs");







    for (int i = 0; i < l1.getBooks().length; i++){
      System.out.println(l1.getBooks()[i].getBookTitle());
    }
  }
}
