package com.example.vien.courtcounter;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Vien on 05/11/2017.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //untuk team vien
    TextView txtPointMerah;
    Button btnTambahTigaMerah, btnTambahDuaMerah, btnFreeMerah;

    // team puutih

    TextView txtPointPutih;
    Button btnTambahTigaPutih, btnTambahDuaPutih, btnFreePutih;

    // tombol reset

    Button btnReset;


    int poinA = 0, poinB= 0;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        definisi();
    }


    // definisi (casting) object ke variabel diatas

    private void definisi(){
        // untuk poin merah

        txtPointMerah = (TextView) findViewById(R.id.textpoinvi);
        btnTambahTigaMerah= (Button) findViewById(R.id.vi3);
        btnTambahDuaMerah = (Button) findViewById(R.id.vi2);
        btnFreeMerah = (Button) findViewById(R.id.vifree);

        // untuk poin putih
        txtPointPutih = (TextView) findViewById(R.id.textpoinaul);
        btnTambahTigaPutih= (Button) findViewById(R.id.ar3);
        btnTambahDuaPutih = (Button) findViewById(R.id.ar2);
        btnFreePutih = (Button) findViewById(R.id.arfree);

    // buttonreset

        btnReset = (Button) findViewById(R.id.btn_reset);

        // fungsi semua tombol

        btnTambahTigaMerah.setOnClickListener(this);
        btnTambahDuaMerah.setOnClickListener(this);
        btnFreeMerah.setOnClickListener(this);


        btnTambahTigaPutih.setOnClickListener(this);
        btnTambahDuaPutih.setOnClickListener(this);
        btnFreePutih.setOnClickListener(this);

        btnReset.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.vi3:
                poinA = poinA + 3;
                txtPointMerah.setText(String.valueOf(poinA));
                break;
            case R.id.vi2:
                poinA = poinA + 2;
                txtPointMerah.setText(String.valueOf(poinA));
                break;
            case R.id.vifree:
                poinA = poinA + 1;
                txtPointMerah.setText(String.valueOf(poinA));
               break;
            case R.id.ar3:
                poinB = poinB + 3;
                txtPointPutih.setText(String.valueOf(poinB));
                break;
            case R.id.ar2:
                poinB = poinB + 2;
                txtPointPutih.setText(String.valueOf(poinB));
                break;
            case R.id.arfree:
                poinB = poinB + 1;
                txtPointPutih.setText(String.valueOf(poinB));
                break;
            case R.id.btn_reset:
                poinA = 0 ;
                poinB = 0;
                txtPointMerah.setText("0");
                txtPointPutih.setText("0");
                break;
        }
    }
}
