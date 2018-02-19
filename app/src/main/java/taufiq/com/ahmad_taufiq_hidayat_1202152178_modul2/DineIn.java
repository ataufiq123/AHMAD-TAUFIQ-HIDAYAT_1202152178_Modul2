package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity {

    private Spinner meja;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        meja = (Spinner) findViewById(R.id.nomeja);

        //memanggil array untuk menampung data yang ada pada spinner nantinya
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //jika spinner tidak kosong maka akan menset isi adapter dengan daftar yg di string.xml
        if (meja != null) {
            meja.setAdapter(adapter);
        }

    }

    public void pilihPesanan(View view) {

        //Intent ke screen daftar menu
        Intent a = new Intent(DineIn.this, DaftarMenu.class);
        startActivity(a);
    }
}
