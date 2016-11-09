package damasco.facitec.edu.py.batmanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class MainActivity extends AppCompatActivity {


    ListView BatmanListView;

    ImageView avatarImageView;
    TextView tituloTextView;
    TextView anhoTexView;
    TextView tipoTextView;
    TextView posterTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BatmanListView = (ListView) findViewById(R.id.listView);



        RestAdapter restAdapter = new RestAdapter
                .Builder()
                .setEndpoint ("http://www.omdbapi.com")
                .build();
        BatmanInterface servicio  = restAdapter.create(BatmanInterface.class);
        servicio.getMovies(new Callback<Result>() {
            @Override
            public void success(Result result, Response response) {
                Log.i("RESULT", result.toString());
                BatmanAdapter adapter = new BatmanAdapter(result.Search,getApplicationContext());
                BatmanListView.setAdapter(adapter);


            }



            @Override
            public void failure(RetrofitError error) {
                Log.e("RESULTADO", error.getMessage());
                Toast.makeText(getApplicationContext(),error.getLocalizedMessage(),Toast.LENGTH_LONG).show();

            }
        });
    }
}
