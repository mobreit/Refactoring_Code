package de.nach.martin.fowler;

public class Rental {
	private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    
    public double getCharge() {
    	return movie.getCharge(daysRented);
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }

	public int getFrequentRenterPoints() {
		if((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1)
			return 2;
		else
			return 1;
	}
}
