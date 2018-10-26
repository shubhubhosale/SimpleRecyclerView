package a.b.c.simplerecyclerview00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;

    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] strings = new String[]{

                "https://cdn.pixabay.com/photo/2018/10/12/22/08/flamingo-3743094_960_720.jpg",
                "https://cdn.pixabay.com/photo/2018/10/05/23/24/chicken-3727097_960_720.jpg",
                "https://cdn.pixabay.com/photo/2018/10/08/14/46/bird-3732867_960_720.jpg",
                "https://cdn.pixabay.com/photo/2018/10/11/23/08/hahn-3741129_960_720.jpg",
                "https://cdn.pixabay.com/photo/2018/10/15/18/32/bee-eaters-3749679_960_720.jpg",
                "https://cdn.pixabay.com/photo/2018/09/23/20/56/sparrow-3698507_960_720.jpg"
        };

        for (int i = 0; i <= 20; i++) {

            String url = strings[i % strings.length];
            arrayList.add(url);

        }

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        adapter = new MyRecyclerViewAdapter(this, arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }
}
