package nyc.c4q.jordansmith.final_exam_practical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreen extends AppCompatActivity {

    EditText username;
    EditText password;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);

        if (getIntent().getBooleanExtra("Exit me", false)) {
            finish();
        }

        initButtons();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.toast_message_enter_username, Toast.LENGTH_SHORT).show();
                }

                if (password.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), R.string.toast_message_enter_password, Toast.LENGTH_SHORT).show();
                }

                if (!username.getText().toString().equals("") && !password.getText().toString().equals("")) {
                    Intent intent = new Intent(v.getContext(), ProfileActivity.class);
                    startActivity(intent);
                }

            }
        });
    }

    private void initButtons() {
        username = (EditText) findViewById(R.id.username_edit_text);
        password = (EditText) findViewById(R.id.password_edit_text);
        submitButton = (Button) findViewById(R.id.submit_button);
    }


}
