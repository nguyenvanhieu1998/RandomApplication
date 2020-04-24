package nguyenvanhieu.fithou.randomapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText edtSoMin,edtSoMax;
    TextView txtResult;
    Button btnRandom;
    static int soMin = 0,soMax =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        btnRandom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String chuoi1 = edtSoMin.getText().toString().trim();
                String chuoi2 = edtSoMax.getText().toString().trim();
                soMin = Integer.parseInt(chuoi1);
                soMax = Integer.parseInt(chuoi2);
                if (chuoi1 == "" || chuoi2.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Hãy nhập đủ dữ liệu", Toast.LENGTH_LONG).show();
                } else if (soMin > soMax)
                {
                    Toast.makeText(MainActivity.this, "Số thứ nhất phải nhỏ hơn số thứ 2 !", Toast.LENGTH_SHORT).show();
                }
                else
                    {
                    Random r = new Random();
                    int kq = r.nextInt(soMax - soMin) + soMin;
                    txtResult.setText(String.valueOf(kq));
                }


            }

        });


    }
    public void anhXa()
    {
        edtSoMin = (EditText) findViewById(R.id.edtSoMin);
        edtSoMax = (EditText) findViewById(R.id.edtSoMax);
        btnRandom = (Button) findViewById(R.id.btnRandom);
        txtResult = (TextView) findViewById(R.id.txtResult);
    }
}
