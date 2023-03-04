package task3;

public class Book {
    private Author bookAuthor = new Author();
    private Title bookTitle = new Title();
    private Content bookContent = new Content();
    public void greateBook(String author, String title, String content){
        this.bookAuthor.author = author;
        this.bookTitle.title = title;
        this.bookContent.content = content;

    }
    public void show(){
        bookAuthor.show();
        bookTitle.show();
        bookContent.show();
    }

}
