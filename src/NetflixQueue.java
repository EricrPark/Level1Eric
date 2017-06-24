import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
 
public class NetflixQueue {
	
	ArrayList<Movie> movies = new ArrayList<Movie>();
	
	public Movie getBestMovie(){
		this.sortMoviesByRating();
		return movies.get(0);
	}
 
	public void addMovie(Movie movie) {
		movies.add(movie);
	}
	
	public Movie getMovie(int movieNumber){
		if(movieNumber < movies.size()) 
		return movies.get(movieNumber);
		else System.err.println("That index is larger than the movie queue. Pass a smaller number to the getMovie() method.");
		return null;
	}
	
	public void sortMoviesByRating() {
		Collections.sort(movies);
	}
 
	public void pirateMovie(Movie movie) {
		Random r = new Random();
		int random = r.nextInt(10);
		if (random == 0) {
			speak("YOU GOT CAUGHT! REROOOREEEEEROOOOREEEEROOOOOOOOOOREEEEEEEEEEEEEEEEEROOOOOOOEREEEEEEEROOEEERRRRROOOOOOOOOOOOOOOOREEEEEEEEEEEEEEEEEEEEEEEEEEROOOOOOOOOOOOOOOREOEOEEOROROROOROORORORORO");
		}
		else {
			speak("enjoy your movie");
			movies.add(movie);
		}
		
	}
	
	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void printMovies() {
		System.out.println("Your Netflix queue contains: ");
		for (Movie movie : movies) {
			System.out.println(movie);
		}
	}
 
}

