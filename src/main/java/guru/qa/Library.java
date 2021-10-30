package guru.qa;

public class Library {
    public static void main(String[] args) {

        System.out.println("Стивен кинг. Цикл Темная башня");

        Book guns = new Book();
        guns.autor = "Стивен Кинг";
        guns.name = "Стрелок";
        guns.year = 1995;
        guns.pages = 480;
        guns.reiting = 8.8;
        guns.sayBook();

        Book drawThree = new Book();
        drawThree.autor = "Стивен Кинг";
        drawThree.name = "Извлечение троих";
        drawThree.year = 1997;
        drawThree.pages = 685;
        drawThree.reiting = 9.1;
        drawThree.sayBook();

        Book wasteLands = new Book();
        wasteLands.autor = "Стивен Кинг";
        wasteLands.name = "Бесплодные земли";
        wasteLands.year = 2000;
        wasteLands.pages = 700;
        wasteLands.reiting = 8.7;
        wasteLands.sayBook();


        Book wizzard = new Book();
        wizzard.autor = "Стивен Кинг";
        wizzard.name = "Колдун и кристал";
        wizzard.year = 2001;
        wizzard.pages = 650;
        wizzard.reiting = 9.2;
        wizzard.sayBook();
    }
}
