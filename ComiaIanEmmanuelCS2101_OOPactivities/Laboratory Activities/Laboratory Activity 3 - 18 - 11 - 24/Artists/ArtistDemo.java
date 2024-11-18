public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Charlie Puth", "American", 32, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Adele", "British", 36, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Misty Copeland", "American", 42, "Ballet Dancer", DanceStyle.BALLET);
        dancer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Kahlo", "Mexican", 47, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Haruki Murakami", "Japanese", 75, "Writer", WritingStyle.FICTION);
        writer.displayInfo();

    }
}