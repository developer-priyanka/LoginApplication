package my.assignment.loginapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView idtxt,pwdtxt;
    Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idtxt=(TextView)findViewById(R.id.emailText);
        pwdtxt=(TextView)findViewById(R.id.passwordText);
        loginbtn=(Button)findViewById(R.id.loginbtn);

    }
    public void onClick(View view){
        String email=null;
        String password=null;
        email=idtxt.getText().toString();
        password=pwdtxt.getText().toString();
        if(!email.contains("@")||email.isEmpty()||!email.contains(".")) {
            Toast.makeText(this, "Please enter vaild EmailId", Toast.LENGTH_SHORT).show();
            clear();
            return;

        }
        if(password.isEmpty()){
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            return;

        }
        Intent welcomeIntent=new Intent(this,MainActivity2.class);
        Bundle bundle=new Bundle();
        bundle.putString("Username",email);
        welcomeIntent.putExtra("Data",bundle);
        startActivity(welcomeIntent);
    }
    public void clear(){
        idtxt.setText("");
        pwdtxt.setText("");
    }


    }

