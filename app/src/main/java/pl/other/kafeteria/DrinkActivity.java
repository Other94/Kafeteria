package pl.other.kafeteria;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends Activity {

    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        int drinkNo = (Integer)getIntent().getExtras().get(EXTRA_DRINKNO);
        Clients clients = Clients.client[drinkNo];

        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(clients.getImageResourceId());
        photo.setContentDescription(clients.getAddress());

        TextView name = (TextView)findViewById(R.id.name);
        name.setText(clients.getTelephone());

        TextView description = (TextView)findViewById(R.id.description);
        description.setText(clients.getAddress());

        TextView description2 = (TextView)findViewById(R.id.description2);
        description2.setText(clients.getCity());
    }
}
