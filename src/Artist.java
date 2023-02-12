public class Artist {
    // TODO: Declare private fields - artistName, birthYear, deathYear
    private String artistName;
    private int birthYear;
    private int deathYear;

    // TODO: Define default constructor

    public Artist() {
        artistName = "unknowm";
        birthYear = -1;
        deathYear = -1;

    }

    // TODO: Define second constructor to initialize
    //       private fields (artistName, birthYear, deathYear)

    public Artist(String artistName, int birthYear, int deathYear){
        this.artistName = artistName;
        this.birthYear = birthYear;
        this.deathYear = deathYear;

    }

    // TODO: Define get methods: getName(), getBirthYear(), getDeathYear()

    public String getArtistName() {
        return artistName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getDeathYear() {
        return deathYear;
    }

    public void printIfo(int birthYear) {
        if(deathYear == -1) {
            System.out.println(birthYear);
        } else {

//            System.out.println("(" + artistName + ")");
        System.out.printf("Artist: %s, (%d, to %d)", artistName, birthYear, deathYear);
        }




    }


    // TODO: Define printInfo() method
    //       If deathYear is entered as -1, only print birthYear


}
