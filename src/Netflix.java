public class Netflix {
	public static void main(String[] args) {
		Movie YN = new Movie("YourName", 5);
		Movie LHCIA = new Movie("Lok Hoow Cual I Am", 2);
		Movie DND = new Movie("Do Not Die", 1);
		Movie PTR = new Movie("Payed to rate", 5);
		Movie MLM = new Movie("Most Ligit Movie", 3);
		System.out.println(YN.getTicketPrice());
		System.out.println(LHCIA.getTicketPrice());
		System.out.println(DND.getTicketPrice());
		System.out.println(PTR.getTicketPrice());
		System.out.println(MLM.getTicketPrice());
		NetflixQueue nq = new NetflixQueue();
		nq.pirateMovie(YN);
		nq.pirateMovie(LHCIA);
		nq.pirateMovie(DND);
		nq.pirateMovie(PTR);
		nq.pirateMovie(MLM);
		nq.printMovies();
		System.out.println("The best movie is " + nq.getBestMovie());
		for (int i = 0; i < 5; i++) {
			
			System.out.println("The next best movie is " + i);
		}
	}
}