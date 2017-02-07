package splash.com.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {


    EditText username;
    EditText password;
    Button login_button;
    TextView txt;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginButton();
    }


    public void LoginButton() {
        username = (EditText) findViewById(R.id.txtuname);
        password = (EditText) findViewById(R.id.txtpass);
        login_button = (Button) findViewById(R.id.blogin);
        txt = (TextView) findViewById(R.id.ptext);

        login_button.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                if (username.getText().toString().equals("ketancool") && password.getText().toString().equals("ketancool")) {
                                                    txt.setText(R.string.app_name);

                                                    //startActivity(new Intent(MainActivity.this, popup.class));
                                                } else {
                                                    txt.setText(R.string.action_settings);

                                                }
                                                startActivity(new Intent(MainActivity.this, popup.class));

                                            }
                                        }
        );


    }
}