package HackerEarthProblems.movierating;

public interface RatingStatisticsCollector {

    // Ratings feed will call this method when new app rating information is received.
    // This is input to your class. ratings is a non negative integer between 0 to 10.

    public void putNewRating(String app, int rating);
    public double getAverageRating(String app);
    public int getRatingsCount(String app);

}
