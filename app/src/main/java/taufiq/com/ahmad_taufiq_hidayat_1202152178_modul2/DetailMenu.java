package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView tv_food, tv_price;
    ImageView iv_photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        // mendapatkan data dari daftar menu menggunakan method getIntent
        Intent intent = getIntent();
        //menangkap value yg dilempar
        String food = intent.getStringExtra("food");
        Integer price = intent.getIntExtra("price", 0);
        Integer photo = intent.getIntExtra("photo", 0);

        tv_food = (TextView) findViewById(R.id.tv_detailFood); //untuk mencari detail makanan
        tv_price = (TextView) findViewById(R.id.tv_detailPrice); //untuk mencari detail harga
        iv_photo = (ImageView) findViewById(R.id.iv_detailPhoto); //untuk mencari detail gambar


        tv_food.setText(food); //untuk menset nama makanan
        tv_price.setText("Harga: Rp. " + price); //untuk menset harga makanan
        iv_photo.setImageResource(photo); //untuk menset photo makanan
    }
}
