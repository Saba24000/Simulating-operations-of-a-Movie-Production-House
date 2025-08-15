package cse213.group44movieproductionhousee.homaira;

public class MarketingManager {
    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    private String movieTitle;

    public String getCampaignTitle() {
        return campaignTitle;
    }

    public void setCampaignTitle(String campaignTitle) {
        this.campaignTitle = campaignTitle;
    }

    private String campaignTitle;

    public float getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(float releaseDate) {
        this.releaseDate = releaseDate;
    }

    private float releaseDate;;

    public MarketingManager(float releaseDate) {
        this.releaseDate = releaseDate;
    }

    public MarketingManager(String movieTitle,  String campaignTitle) {}

    @Override
    public String toString() {
        return "MarketingManager{" +
                "movieTitle='" + movieTitle + '\'' +
                ", campaignTitle='" + campaignTitle + '\'' +
                ", releaseDate=" + releaseDate +
                '}';
    }
}



