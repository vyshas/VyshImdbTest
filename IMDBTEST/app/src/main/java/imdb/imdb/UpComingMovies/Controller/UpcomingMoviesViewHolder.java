package imdb.imdb.UpComingMovies.Controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import testappexpert.com.appexpert.R;


class UpcomingMoviesViewHolder extends RecyclerView.ViewHolder {

    ImageView mPicture;


    public UpcomingMoviesViewHolder(View v) {
        super(v);
        mPicture = (ImageView) v.findViewById(R.id.upcoming_images);
    }

    public ImageView getPicture() {
        return mPicture;
    }


}
