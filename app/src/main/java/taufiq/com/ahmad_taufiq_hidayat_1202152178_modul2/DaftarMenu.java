package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuAdapter;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedList;

public class DaftarMenu extends AppCompatActivity {

    // Membuat variabel linkedlist untuk menampung data2 dummy
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();

    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        //memanggil class dummies data
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // Create an adapter and supply the data to be displayed.
        mAdapter = new RecyclerViewAdapter(this, foods, priceses, photos);
        // Connect the adapter with the RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // Give the RecyclerView a default layout manager.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){//pengulangan untuk menghasilkan data yang banyak
            foods.add("Sate Cumi"); //untuk menambah nama makanan
            foods.add("Sate Kulit");
            foods.add("Sate Paha");
            foods.add("Ramyeon");
            foods.add("Wings");

            priceses.add(50000); //untuk menambah harga makanan
            priceses.add(25000);
            priceses.add(70000);
            priceses.add(25000);
            priceses.add(25000);

            photos.add(R.drawable.ic_launcher_background); //untuk menambahkan foto
            photos.add(R.drawable.ic_launcher_background);
            photos.add(R.drawable.ic_launcher_background);
            photos.add(R.drawable.ic_launcher_background);
            photos.add(R.drawable.ic_launcher_background);
        }
    }
}
