package imdb.imdb.RestService;

import retrofit.RestAdapter;

/**
 * Created by vyshakh on 15/02/2016.
 */
public class RestClient {

    private static Api REST_CLIENT;
    private static String ROOT =
            "http://tmdb-api.appspot.com/views/movie";

    static {
        setupRestClient();
    }

    private RestClient() {}

    public static Api get() {
        return REST_CLIENT;
    }

    private static void setupRestClient() {
        RestAdapter.Builder builder = new RestAdapter.Builder()
                .setEndpoint(ROOT)
                .setLogLevel(RestAdapter.LogLevel.FULL);

        RestAdapter restAdapter = builder.build();
        REST_CLIENT = restAdapter.create(Api.class);
    }
}
