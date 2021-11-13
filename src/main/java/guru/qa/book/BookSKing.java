package guru.qa.book;

public class BookSKing {
    static String author = "Стивен Кинг";
    private String name;
    private int year;
    private int pages;
    private double reiting;
    GenreBook genreBook;
    Format format;

    public BookSKing(String name, int year, int pages, double reiting, GenreBook genreBook) {
        this.name = name;
        this.year = year;
        this.pages = pages;
        this.reiting = reiting;
        this.genreBook = genreBook;
    }

    public static class Format {
        public static String format = "Бумажный";

        public static void sayBookFormat(){
            System.out.println("Формат книг: " + format);
        }
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public double getReiting() {
        return reiting;
    }

    public void setReiting(double reiting) {
        this.reiting = reiting;
    }

    public void sayBook() {
        System.out.println("Автор: " + author + "; Название: " + name + "; Год выпуска: " + year + "; Кол-во страниц: "
                + pages + "; Рейтинг: " + reiting + "; Жанр: " + genreBook);
    }
}

