package guru.qa.book;

public class Book {
    String author;
    String name;
    int year;
    int pages;
    double reiting;
    GenreBook genreBook;

    public Book(String author, String name, int year, int pages, double reiting, GenreBook genreBook){
        this.author = author;
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.reiting = reiting;
        this.genreBook = genreBook;
    }

    public void sayBook() {
        System.out.println("Автор: " + author + "; Название: " + name + "; Год выпуска: " + year + "; Кол-во страниц: "
                + pages + "; Рейтинг: " + reiting + "; Жанр: " + genreBook);
    }
}

