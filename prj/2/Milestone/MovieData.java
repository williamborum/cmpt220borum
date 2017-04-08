import java.util.ArrayList;

public class MovieData {
  private String title = "";
  private String year = "";
  private String director = "";
  private String runtime = "";
  private String plot = "";
  private String rated = "";
  private String genre = "";
  private String actors = "";
  private double imdbRating = 0.0;
  private String released = "";
  private String type = "";
  
  private ArrayList<Object> tmp = new ArrayList<Object>();
  
  public MovieData() {
    
  }
  
  public MovieData(String title, String year, String director, String runtime, String plot, String rated, String genre, String actors, double imdbRating, String released, String type) {
    this.title = title;
    this.year = year;
    this.director = director;
    this.runtime = runtime;
    this.plot = plot;
    this.rated = rated;
    this.genre = genre;
    this.actors = actors; 
    this.imdbRating = imdbRating;
    this.released = released;
    this.type = type;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getYear() {
    return year;
  }
  
  public String getDirector() {
    return director;
  }
  
  public String getRuntime() {
    return runtime;
  }
  
  public String getPlot() {
    return plot;
  }
  
  public String getRated() {
    return rated;
  }
  
  public String getGenre() {
    return genre;
  }
  
  public String getActors() {
    return actors;
  }
  
  public double getIMDBRating() {
    return imdbRating;
  }
  
  public String getReleased() {
    return released;
  }
  
  public String getType() {
    return type;
  }
  
  public ArrayList<Object> getList() {
    tmp.clear();
    tmp.add(title);
    tmp.add(year);
    tmp.add(director);
    tmp.add(runtime);
    tmp.add(plot);
    tmp.add(rated);
    tmp.add(genre);
    tmp.add(actors);
    tmp.add(imdbRating);
    tmp.add(released);
    return tmp;
  }
  
  public String toString() {
    return getList().toString();
  }
  
  public String prettyPrint() {
    return title + ", released " + released + ", directed by " + director + " and starring " + actors + 
        ".\n" + plot + " in this " + rated + " rated " + runtime + " " + genre + " " + type + ". ";
  }
  
  
  
  public static void main(String[] args) {
    
  }
}
