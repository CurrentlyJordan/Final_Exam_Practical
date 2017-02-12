package nyc.c4q.jordansmith.final_exam_practical;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity implements Listener, View.OnClickListener {

    RecyclerView recyclerView;
    ImageButton imageButton_1;
    ImageButton imageButton_2;
    ImageButton imageButton_3;
    ImageButton imageButton_4;
    List<ButtonType> drawerButtonList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
        initViews();
        fillList();
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new DrawerAdapter(drawerButtonList, this));

    }


    void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        imageButton_1 = (ImageButton) findViewById(R.id.button_1);
        imageButton_2 = (ImageButton) findViewById(R.id.button_2);
        imageButton_3 = (ImageButton) findViewById(R.id.button_3);
        imageButton_4 = (ImageButton) findViewById(R.id.button_4);
        imageButton_1.setOnClickListener(this);
        imageButton_2.setOnClickListener(this);
        imageButton_3.setOnClickListener(this);
        imageButton_4.setOnClickListener(this);
    }

    void fillList() {
        drawerButtonList.add(ButtonType.BUTTON1);
        drawerButtonList.add(ButtonType.BUTTON2);
        drawerButtonList.add(ButtonType.BUTTON3);
        drawerButtonList.add(ButtonType.BUTTON4);
    }


    @Override
    public void button1Action() {
        Toast.makeText(getApplicationContext(), R.string.toast_select_heart_activity, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void button2Action() {
        Toast.makeText(getApplicationContext(), R.string.toast_select_message_activity, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void button3Action() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    @Override
    public void button4Action() {
        Toast.makeText(getApplicationContext(), R.string.toast_select_logout_activity, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginScreen.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Exit me", true);
        startActivity(intent);
        finish();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_1:
                button1Action();
                break;
            case R.id.button_2:
                button2Action();
                break;
            case R.id.button_3:
                button3Action();
                break;
            case R.id.button_4:
                button4Action();
                break;
        }
    }
}
