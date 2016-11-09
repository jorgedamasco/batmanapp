package damasco.facitec.edu.py.batmanapp;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by JORGE on 09/11/2016.
 */
public interface BatmanInterface {
    @GET("/?s=Batman")
    void getMovies(Callback<Result> callback);


}
