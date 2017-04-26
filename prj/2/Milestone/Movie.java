import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONException;
import org.json.JSONObject;


public class Movie {
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
    return new URL(BASE_URL + "t=" + title.replaceAll(" ", "+") + "&type=movie");
  }
  
  private static URL urlMaker(String title, int year) throws MalformedURLException {
    return new URL(BASE_URL + "t=" + title.replaceAll(" ", "+") + "&y=" + year + "&type=movie");
  }
  
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
    String imdbRating = j.getString("imdbRating");
    String released = j.getString("Released");
    String type = j.getString("Type");
    String imdbID = j.getString("imdbID");
    movieData = new MovieData(title, year, director, runtime, plot, rated, genre, actors, imdbRating, released, type, imdbID);
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
    }
    catch (Exception ex) {
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
    @SuppressWarnings("resource")
    Scanner scanner1 = new Scanner(System.in);
    //System.out.println("Enter the number of the movie you want to see: ");
    
    for(int x = 0; x < movies.size(); x++) {
      System.out.println(x+1 + ": " + movies.get(x));
    }
    
    System.out.println("Enter the number of the movie you want to see: ");
    
    int choice = scanner1.nextInt();
    return choice - 1;
  }
  
  public static String getAreaCode() {
	  @SuppressWarnings("resource")
    Scanner scanner2 = new Scanner(System.in);
	  System.out.print("Please enter your zip code: ");
	  String tmp = "";
	  while(true) {
	    tmp = scanner2.next();
	    if(isZipCode(tmp)) {
	      return tmp;
	    }
	    else System.out.print("A zip code is 5 numbers, please enter again: ");
	  }
  }
  
  private static boolean isZipCode(String zip) {
	  if(zip.length() != 5) return false;
    for(int x = 0; x < 5; x++) {
	    if(!Character.isDigit(zip.charAt(x))) return false;
	  }
    return true;
  }
  
//  private static boolean isYear(String y) {
//    for(int x = 0; x < 5; x++) {
//      if(!Character.isDigit(y.charAt(x))) return false;
//    }
//    return true;
//  }
  
  private static String removeYear(String s) {
    int beginningChar = getPar(s);
    if(beginningChar != -1) return s.substring(0, beginningChar);
    else return s;
  }
  
  
  private static int getPar(String s) {
    for(int x = 0; x < s.length(); x++) {
      if(s.charAt(x) == '(') return x;
    }
    return -1;
  }
  
//  public static boolean gotoIMDB(MovieData movieData) {
//    @SuppressWarnings("resource")
//    Scanner scanner3 = new Scanner(System.in);
//    System.out.println("Would you like to see more about this movie? (y/n) "); 
//    
//    String c = scanner3.next();
//    if(c.toLowerCase().charAt(0) == 'y') {
//      openWebpage("http://www.imdb.com/title/" + movieData.getIMDBID());
//      return true;
//    }
//    return false;
//  }
  
  public static boolean yesOrNo() {
    @SuppressWarnings("resource")
    Scanner scanner3 = new Scanner(System.in);
    System.out.println("Would you like to see more about this movie? (y/n) "); 
    
    String c = scanner3.next();
    if(c.toLowerCase().charAt(0) == 'y') return true;
    return false;
  }
  
  

  public static void main(String[] args) throws MalformedURLException, IOException, JSONException {
    String areaCode = getAreaCode();
    String test = parseURL("http://www.fandango.com/" + areaCode + "_movietimes");
    ArrayList<String> currentMovies = getMovieFromParsedString(test);
    
    String choice  = removeYear(currentMovies.get(askUser(currentMovies)));
    
    JSONObject j = readJsonFromUrl(urlMaker(choice));
    
    MovieData m = createMovieInstance(j);
    if(Integer.parseInt(m.getYear().substring(0, 4)) < 2016) {
      j = readJsonFromUrl(urlMaker(choice, 2017));
      //System.out.println(urlMaker(choice, 2017));
      m = createMovieInstance(j);
    }
    
    System.out.println(m.prettyPrint());
    
    //gotoIMDB(m);
    if(yesOrNo()) openWebpage("http://www.imdb.com/title/" + m.getIMDBID());
    
  }

}
