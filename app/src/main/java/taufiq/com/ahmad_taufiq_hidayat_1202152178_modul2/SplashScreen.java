package taufiq.com.ahmad_taufiq_hidayat_1202152178_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Mengatur agar bisa tampil fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        //mengatur splashscreen sehingga nanti setelah 3 detik pindah ke main activity
        new Handler().postDelayed(new Runnable() {

                                      @Override
                                      public void run() {

                                          //mengatur intent SplashScreen ke Main Activity
                                          Intent i = new Intent(SplashScreen.this, MainActivity.class);
                                          startActivity(i);
                                          //menampilkan toast
                                          Toast.makeText(SplashScreen.this,"AHMAD TAUFIQ HIDAYAT_1202152178",Toast.LENGTH_LONG).show();

                                          this.finish();
                                      }

                                      private void finish() {

                                      }
                                  },
                //mengatur time out dari splash screen
                3000);

    };
}