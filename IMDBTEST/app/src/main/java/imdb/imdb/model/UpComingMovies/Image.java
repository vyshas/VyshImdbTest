
package imdb.imdb.model.UpComingMovies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Image {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("aspectRatio")
    @Expose
    private Double aspectRatio;

    /**
     * 
     * @return
     *     The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 
     * @param url
     *     The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 
     * @return
     *     The aspectRatio
     */
    public Double getAspectRatio() {
        return aspectRatio;
    }

    /**
     * 
     * @param aspectRatio
     *     The aspectRatio
     */
    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

}
