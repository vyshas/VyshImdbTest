package imdb.imdb.RestService;


import imdb.imdb.model.UpComingMovies.UpComingMovies;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;

/**
 * Created by vyshakh on 15/02/2016.
 */
public interface Api {

    @Headers({"token:f90384c1-5a26-4a76-9f3b-fc0b37fe06f8"})
    @GET("/upcoming")
    void getUpComingMovies(Callback<UpComingMovies> callback);
}