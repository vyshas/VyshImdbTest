package imdb.imdb.domain;

/**
 * Created by vyshakh on 15/02/2016.
 */
public class UpcomingDisplayData {


    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     *     The layout
     */
    public String getLayout() {
        return layout;
    }

    /**
     *
     * @param layout
     *     The layout
     */
    public void setLayout(String layout) {
        this.layout = layout;
    }


    private String imageURL;
    private String title;
    private String layout;


    public UpcomingDisplayData(String imageURL, String title, String layout) {
        this.imageURL = imageURL;
        this.title = title;
        this.layout=layout;
    }





}
