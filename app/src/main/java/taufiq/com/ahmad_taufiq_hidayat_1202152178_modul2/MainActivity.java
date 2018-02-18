package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean dineIn = false, takeAway = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Ketika diklik tombol pesan
    public void btnPesan(View view) {
        if (dineIn) {
            // menampilkan toast
            Toast.makeText(this, "Anda Memilih Dine In", Toast.LENGTH_LONG).show();
            //pindah screen ke DineIn
            Intent a = new Intent(MainActivity.this, DineIn.class);
            startActivity(a);
        } else if (takeAway) {
            //
            Toast.makeText(this, "Anda Memilih Take Away", Toast.LENGTH_LONG).show();
            Intent a = new Intent(MainActivity.this, TakeAway.class);
            startActivity(a);
        } else {
            Toast.makeText(this, "Pilih salah satu", Toast.LENGTH_LONG).show();
        }
    }

    // mengembalikan true jika checked
    public void jenisPesanan(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        if (checked) {
            switch (view.getId()) {
                case R.id.radio_dine_in:
                    if (checked) {
                        dineIn = true;
                    }
                    break;
                case R.id.radio_take_away:
                    if (checked) {
                        takeAway = true;
                    }
                    break;
            }
        }
    }


}
