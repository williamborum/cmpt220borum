import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONException;
import org.json.JSONObject;


public class movie {
  final static String BASE_URL = "http://www.omdbapi.com/?";
  
  private static String readAll(Reader rd) throws IOException {
    StringBuilder sb = new StringBuilder();
    int cp;
    while ((cp = rd.read()) != -1) {
      sb.append((char) cp);
    }
    return sb.toString();
  }

  public static JSONObject readJsonFromUrl(URL url) throws IOException, JSONException {
    InputStream is = url.openStream();
    try {
      BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));
      String jsonText = readAll(rd);
      JSONObject json = new JSONObject(jsonText);
      return json;
    } 
    finally {
      is.close();
    }
  }
  
  private static URL urlMaker(String title) throws MalformedURLException {
    return new URL(BASE_URL + "t=" + title.replaceAll(" ", "+"));
  }
  
//  private URL urlMaker(String title, int year) throws MalformedURLException {
//    return new URL(BASE_URL + "t=" + title.replaceAll(" ", "+") + "&y=" + year);
//  }
  
  private static MovieData createMovieInstance(JSONObject j) throws JSONException {
    MovieData movieData = new MovieData();
    String title = j.getString("Title");
    String year = j.getString("Year");
    String director = j.getString("Director");
    String runtime = j.getString("Runtime");
    String plot = j.getString("Plot");
    String rated = j.getString("Rated");
    String genre = j.getString("Genre");
    String actors = j.getString("Actors");
    double imdbRating = Double.parseDouble(j.getString("imdbRating"));
    String released = j.getString("Released");
    String type = j.getString("Type");
    movieData = new MovieData(title, year, director, runtime, plot, rated, genre, actors, imdbRating, released, type);
    return movieData;
  }
  
  public static void openWebpage(String urlString) {
    try {
        Desktop.getDesktop().browse(new URL(urlString).toURI());
    } 
    catch (Exception e) {
        e.printStackTrace();
    }
  }
  
  private static String parseURL(String url) {
    String content = null;
    URLConnection connection = null;
    try {
      connection =  new URL(url).openConnection();
      Scanner scanner = new Scanner(connection.getInputStream());
      scanner.useDelimiter("\\Z");
      content = scanner.next();
      scanner.close();
    }catch ( Exception ex ) {
        ex.printStackTrace();
    }
    //System.out.println(content);
    return content;
  }
  
  private static ArrayList<String> getMovieFromParsedString(String s) {
    //char[] c = s.toCharArray();
    String[] lines = s.split("\n");
    ArrayList<String> cut = new ArrayList<>();
    
    for(int x = 0; x < lines.length; x++) {
      if(lines[x].contains("dark showtimes-movie-title")) cut.add(lines[x]);
    }
    return cutToMovieTitles(cut);
  }
  
  private static ArrayList<String> cutToMovieTitles(ArrayList<String> uncut) {
    ArrayList<String> fList = new ArrayList<>();
    Pattern p = Pattern.compile("\\>(.*?)\\<");
    for(String s : uncut) {
      Matcher m = p.matcher(s);
      while(m.find()) {
        //System.out.println(m.group());
        String movie = m.group().replaceAll("<", "").replaceAll(">", "");
        if(!fList.contains(movie)) fList.add(movie);
      }
    }
    return fList;
  }
  
  public static int askUser(ArrayList<String> movies) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number of the movie you want to see: ");
    
    for(int x = 0; x < movies.size(); x++) {
      System.out.println(x+1 + ": " + movies.get(x));
    }
    
    int choice = scanner.nextInt();
    
    scanner.close();
    return choice - 1;
  }
  
  
  public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter the title of a movie: ");
//    
//    String input = scanner.nextLine();
//    
//    JSONObject j = readJsonFromUrl(urlMaker(input));
//    
//    System.out.println(j);
//    System.out.println(createMovieInstance(j));
//    System.out.println(createMovieInstance(j).prettyPrint());
//    
//    openWebpage("http://www.reddit.com");
    
    String test = parseURL("http://www.fandango.com/12540_movietimes");
    
    //System.out.println(getMovieFromParsedString(test));
    ArrayList<String> currentMovies = getMovieFromParsedString(test);
    System.out.println(currentMovies);
    
    JSONObject j = readJsonFromUrl(urlMaker(currentMovies.get(askUser(currentMovies))));
    System.out.println(createMovieInstance(j).prettyPrint());
    
    //PrintWriter writer = new PrintWriter("test.txt");
    //writer.println(test);
    
    
    //System.out.println(test);
    
    //writer.close();
    //scanner.close();
  }

}
