package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pilihpesan(View view) {

        //Pindah screen ke daftar menu
        Intent a = new Intent(TakeAway.this,DaftarMenu.class);
        startActivity(a);
    }
}
