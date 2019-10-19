package id.ac.poliban.dts.farah.prj02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variable
    EditText angka_pertama, angka_kedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama = findViewById(R.id.angka_pertama);
        angka_kedua = findViewById(R.id.angka_kedua);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali =  findViewById(R.id.kali);
        bagi =  findViewById(R.id.bagi);
        bersihkan = findViewById(R.id.bersihkan);
        hasil = findViewById(R.id.hasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (angka_pertama.getText().length()>0 && (angka_kedua.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(angka_pertama.getText().toString());
                    double angka2 = Double.parseDouble(angka_kedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast.makeText(MainActivity.this, "Mohon masukkan Angka Pertama & Kedua", Toast.LENGTH_SHORT).show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angka_pertama.setText("");
                angka_kedua.setText("");
                hasil.setText("");
                angka_pertama.requestFocus();
            }
        });
    }
}
