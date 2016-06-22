package imdb.imdb.domain;

import java.util.ArrayList;

import imdb.imdb.model.UpComingMovies.Image;
import imdb.imdb.model.UpComingMovies.Item;
import imdb.imdb.model.UpComingMovies.Section;
import imdb.imdb.model.UpComingMovies.UpComingMovies;


/**
 * Class used to map objects for displaying purpose.
 * Created by vyshakh on 15/02/2016.
 */

public class Mapper {

Mapper()
        {

        }

    /**
     * Maps the upcoming objects to UocomingDisplayData object thereby making it easier  to access object members for presentation
     * @param upComingMovies
     * @return  List of UpcomingDisplayData object which can be used for presentation
     */
    public static ArrayList<UpcomingDisplayData> getDisplayDataList(UpComingMovies upComingMovies)
    {
        ArrayList<UpcomingDisplayData> upcomingDisplayDataList =new ArrayList<UpcomingDisplayData>();

            for (Section section:upComingMovies.getSections()) {
                for (Item item:section.getItems())
                {
                    for(Image image:item.getImages())
                    {
                        UpcomingDisplayData upcomingDisplayData =new UpcomingDisplayData(image.getUrl(),item.getTitle(),item.getLayout());
                        upcomingDisplayDataList.add(upcomingDisplayData);
                    }

                }

            }

        return upcomingDisplayDataList;
    }



}
