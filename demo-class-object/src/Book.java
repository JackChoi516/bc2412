public class Book {
  private String title;
  private String author;


  public Book(String title, String author){
    this.title = title;
    this.author = author;
  }

  public String getBookTitle(){
    return this.title;
  }

  public void setTitle(String title){
    this.title = title;
  }

  public void setAuthor(String author){
    this.author = author;
  }
}
