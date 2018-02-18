package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnPesan(View view) {

    }

    public void jenisPesanan(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_dine_in:
                if (checked){
                    Toast.makeText(this,"Anda Memilih Dine In",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MainActivity.this,DineIn.class);
                    startActivity(a);
                }
                    break;
            case R.id.radio_take_away:
                if (checked){
                    Toast.makeText(this,"Anda Memilih Take Away",Toast.LENGTH_LONG).show();
                    Intent a = new Intent(MainActivity.this,TakeAway.class);
                    startActivity(a);
                }
                    break;
        }
    }
}
