package imdb.imdb.UpComingMovies.Controller;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import imdb.imdb.domain.UpcomingDisplayData;
import testappexpert.com.appexpert.R;

/**
 * Created by vyshakh on 2/16/2016.
 */
public class UpcomingMoviesDataAdapter extends RecyclerView.Adapter<UpcomingMoviesViewHolder> {
    private Activity mainActivity;
    private List<UpcomingDisplayData> upcomingDisplayDataList;


    public UpcomingMoviesDataAdapter(Activity mainActivity, List<UpcomingDisplayData> upcomingDisplayDataList) {
        this.mainActivity = mainActivity;
        this.upcomingDisplayDataList = upcomingDisplayDataList;
    }

    @Override
    public int getItemCount() {
        return upcomingDisplayDataList.size();
    }

    @Override
    public void onBindViewHolder(UpcomingMoviesViewHolder upcomingMoviesViewHolder, int i) {
        UpcomingDisplayData upcomingDisplayData = upcomingDisplayDataList.get(i);

        upcomingMoviesViewHolder.getPicture().setPadding(8, 8, 8, 8);
        upcomingMoviesViewHolder.getPicture().setCropToPadding(true);

        Picasso.with(mainActivity).load(upcomingDisplayData.getImageURL()).resize(300, 300).centerInside().into(upcomingMoviesViewHolder.getPicture());

    }

    @Override
    public UpcomingMoviesViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.upcoming_item, viewGroup, false);

        return new UpcomingMoviesViewHolder(itemView);
    }

    public List<UpcomingDisplayData> getUpcomingDisplayDataList() {
        return upcomingDisplayDataList;
    }

    public void setUpcomingDisplayDataList(List<UpcomingDisplayData> upcomingDisplayDataList) {
        this.upcomingDisplayDataList = upcomingDisplayDataList;
    }
}

