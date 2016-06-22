package imdb.imdb.UpComingMovies.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import testappexpert.com.appexpert.R;
import imdb.imdb.RestService.RestClient;
import imdb.imdb.UpComingMovies.Controller.UpcomingMoviesDataAdapter;
import imdb.imdb.Utils.ItemOffsetDecoration;
import imdb.imdb.domain.UpcomingDisplayData;
import imdb.imdb.domain.Mapper;
import imdb.imdb.model.UpComingMovies.UpComingMovies;

/**
 * Created by vyshakh on 2/13/2016.
 */
public class UpComingMoviesFragment extends Fragment {

    private List<UpcomingDisplayData> upcomingDisplayDataList =new ArrayList<UpcomingDisplayData>();
    private RecyclerView photoGridRecyclerView;

    private final static String TAG = UpComingMoviesFragment.class.getSimpleName();
    public UpComingMoviesFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_upcomingmovies, container, false);
        setupRecyclerView(rootView);
        getUpcomingMovies();
        // Inflate the layout for this fragment
        return rootView;
    }



    private void getUpcomingMovies()
    {
        RestClient.get().getUpComingMovies(new Callback<UpComingMovies>() {
            @Override
            public void success(UpComingMovies upComingMovies, Response response) {
                upcomingDisplayDataList = new ArrayList<UpcomingDisplayData>(Mapper.getDisplayDataList(upComingMovies));
                UpcomingMoviesDataAdapter adapter = (UpcomingMoviesDataAdapter) photoGridRecyclerView.getAdapter();
                adapter.setUpcomingDisplayDataList(upcomingDisplayDataList);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void failure(RetrofitError error) {
                Log.v("App", "failure , retrofit error:" + error.getMessage());
            }
        });
    }


    private void setupRecyclerView(View rootView) {

        photoGridRecyclerView = (RecyclerView)rootView.findViewById(R.id.activity_main_recycler_view);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        photoGridRecyclerView.setLayoutManager(manager);
        ItemOffsetDecoration itemDecoration = new ItemOffsetDecoration(getActivity(), R.dimen.item_offset);
        photoGridRecyclerView.addItemDecoration(itemDecoration);
        photoGridRecyclerView.setAdapter(new UpcomingMoviesDataAdapter(getActivity(), new ArrayList<UpcomingDisplayData>()));


    }




    }



