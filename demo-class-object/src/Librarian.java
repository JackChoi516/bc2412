public class Librarian {
  private Library library;

  public Librarian(Library library){
    this.library = library;
  }

  public void addBook(Book book){
    library.addBook(book);
  }
}
