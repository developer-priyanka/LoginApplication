package my.assignment.loginapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textview=(TextView)findViewById(R.id.welcometxt);
        Bundle b=getIntent().getBundleExtra("Data");
        textview.setText("Welcome "+b.getString("Username")+" !");

    }
}
