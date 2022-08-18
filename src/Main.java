public class Main {
    public static void main(String[] args) {
        Author author1=new Author("Jack","London");
        Author author2=new Author("Stephen","King");
        Book book1=new Book("TheGame",1905,author1);
        Book book2=new Book("It",1986,author2);

        System.out.println("Автор:"+ author1.getFullName());
        System.out.println("Автор:"+ author2.getFullName());

        System.out.println("Название книги:"+book1.getName()+",Год издания книги:"+book1.getYear()+",Автор книги:"+book1.getAuthor().getFullName());
        System.out.println("Название книги:"+book2.getName()+",Год издания книги:"+book2.getYear()+",Автор книги:"+book2.getAuthor().getFullName());


    }
}
