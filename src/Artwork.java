public class Artwork {
    // TODO: Declare private fields - title, yearCreated
    private String title;

    private int yearCreated;

    // TODO: Declare private field artist of type Artist
    private Artist artist;

    // TODO: Define default constructor

    public Artwork() {
        title = "unknown";
        yearCreated = -1;



    }
    Artist artist1 = new Artist();

    // TODO: Define get methods: getTitle(), getYearCreated()

    public String getTitle() {
        return title;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    // TODO: Define second constructor to initialize
    //       private fields (title, yearCreated, artist)

    public Artwork(String title, int yearCreated, Artist artist) {
        this.title = title;
        this.yearCreated = yearCreated;
        this.artist = artist;
    }

    public void printInfo() {
        artist1.printIfo(yearCreated);
        System.out.printf("Title: %s, %d", title, yearCreated);


    }

    // TODO: Define printInfo() method
    //       Call the printInfo() method in Artist.java to print an artist's information


}
