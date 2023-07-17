package sg.edu.rp.c346.id22017424.p10_todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    ArrayList<ToDoItem> al;

    ArrayAdapter<ToDoItem> aa;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listView);
        al = new ArrayList<>();

        // al.add("Pie - 9.0");
        // al.add("Oreo - 8.0 - 8.1");
        // al.add("Nougat - 7.0 - 7.1.2");
        // al.add("Marshmallow - 6.0 - 6.0.1");
        // al.add("Lollipop - 5.0 - 5.1.1");
        // al.add("KitKat - 4.4 - 4.4.4");
        // al.add("Jelly Bean - 4.1 - 4.3.1");

        ToDoItem item1 = new ToDoItem("Go for movie", "1/8/2023");
        ToDoItem item2 = new ToDoItem("Go for haircut", "2/8/2023");

        al.add(item1);
        al.add(item2);

        // aaAndroidVersions = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,alAndroidVersions);
        adapter = new CustomAdapter(this, R.layout.row, al);
        // lvAndroidVersions.setAdapter(aaAndroidVersions);
        lv.setAdapter(adapter);
    }
}