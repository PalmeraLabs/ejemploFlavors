package ejemplo_flavors.palmeralabs.com.ejemploflavors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import ejemplo_flavors.palmeralabs.com.ejemploflavors.ejemplo.EjemploActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.button);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                launch_ejemplo();

            }
        });
    }

    public void launch_ejemplo(){
        Intent i = new Intent(this, EjemploActivity.class);
        startActivity(i);
    }

}
