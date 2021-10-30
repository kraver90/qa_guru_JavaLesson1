package guru.qa;

public class Book {
    String autor;
    String name;
    int year;
    int pages;
    double reiting;

    public void sayBook(){
        System.out.println("Автор: "+autor+"; Название: "  +name+ "; Год выпуска: "+year+ "; Кол-во страниц: "
                +pages+"; Рейтинг: "+reiting);
    }
}

