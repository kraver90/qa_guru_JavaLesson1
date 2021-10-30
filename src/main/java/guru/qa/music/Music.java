package guru.qa.music;

public class Music {
    String label;
    String nameSinger;
    String nameAlbom;
    int year;
    Format format;
    GenreMusic genreMusic;
    int downloads;

    public Music(String label, String nameSinger, String nameAlbom, int year, Format format, GenreMusic genreMusic,
                 int downloads) {
        this.label = label;
        this.nameSinger = nameSinger;
        this.nameAlbom = nameAlbom;
        this.year = year;
        this.format = format;
        this.genreMusic = genreMusic;
        this.downloads = downloads;
    }

    public void sayMusic() {
        System.out.println("Лейбл: " + label + "; Группа: " + nameSinger + "; Название альбома: " + nameAlbom +
                "; Год выпуска: " + year + "; Формат: " + format + "; Жанр: " + genreMusic + "; Кол-во скачиваний: "
                + downloads);
    }
}
