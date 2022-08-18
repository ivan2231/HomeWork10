public class Book {
    private  final String name;
    private int year;
    private  final Author author;


    public Book(String name, int year, Author author){
        this.year = year;
        this.author = author;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public Author getAuthor() {
        return author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}





