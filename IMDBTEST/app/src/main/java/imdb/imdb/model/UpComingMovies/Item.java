
package imdb.imdb.model.UpComingMovies;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Item {

    @SerializedName("images")
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @SerializedName("layout")
    @Expose
    private String layout;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("actions")
    @Expose
    private List<Action> actions = new ArrayList<Action>();
    @SerializedName("title")
    @Expose
    private String title;


    private Image image;

    /**
     * 
     * @return
     *     The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     * 
     * @param images
     *     The images
     */
    public void setImages(List<Image> images) {
        this.images = images;

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

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The actions
     */
    public List<Action> getActions() {
        return actions;
    }

    /**
     * 
     * @param actions
     *     The actions
     */
    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}
