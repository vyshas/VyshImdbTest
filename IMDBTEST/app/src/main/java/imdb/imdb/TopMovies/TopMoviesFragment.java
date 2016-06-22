package imdb.imdb.TopMovies;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import testappexpert.com.appexpert.R;


/**
 * Created by vyshakh on 2/13/2016.
 */
public class TopMoviesFragment extends Fragment {


    public TopMoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {





        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_topmovies, container, false);
    }
}
