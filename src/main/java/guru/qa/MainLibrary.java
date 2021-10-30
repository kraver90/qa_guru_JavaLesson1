package guru.qa;

import guru.qa.book.Book;
import guru.qa.book.GenreBook;
import guru.qa.music.Format;
import guru.qa.music.GenreMusic;
import guru.qa.music.Music;

public class MainLibrary {
    public static void main(String[] args) {

        System.out.println("Книги в наличии:");

        Book shooter = new Book("Стивен Кинг", "Стрелок", 1995, 480,8.8, GenreBook.HORROR);
        Book drawThree = new Book("Стивен Кинг", "Извлечение троих", 1997, 685,9.1, GenreBook.DETECTIVE);
        Book wasteLands = new Book("Стивен Кинг", "Бесплодные земли", 2000, 700,8.7, GenreBook.HORROR);
        Book wizzard = new Book("Стивен Кинг", "Колдун и кристал", 2001, 650,9.2, GenreBook.FANTASTIC);

        shooter.sayBook();
        drawThree.sayBook();
        wasteLands.sayBook();
        wizzard.sayBook();
        System.out.println();

        System.out.println("Музыкальные пластинки в наличии:");

        Music metallicaMOP = new Music("Elektra Records","Metallica", "Master of Puppets",
                1986, Format.VINYL, GenreMusic.METAL, 487);
        Music metallicaDM = new Music("Рики Рубин","Metallica", "Death Magnetic",
                2010, Format.VINYL, GenreMusic.METAL, 1900);
        Music eminemROG = new Music("D12","Eminem", "Rap of God",
                2018, Format.CD, GenreMusic.RAP, 2);

        metallicaMOP.sayMusic();
        metallicaDM.sayMusic();
        eminemROG.sayMusic();


    }
}
