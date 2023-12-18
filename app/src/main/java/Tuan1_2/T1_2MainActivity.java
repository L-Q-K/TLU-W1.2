package Tuan1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.w12.R;

public class T1_2MainActivity extends AppCompatActivity {

    EditText num1, num2;
    Button submit;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t12_main);

        num1 = findViewById(R.id.FirstNumber);
        num2 = findViewById(R.id.SecondNumber);

        submit = findViewById(R.id.Submit);

        result = findViewById(R.id.Result);

        submit.setOnClickListener(v -> {
            getSum();
        });
    }

    private void getSum() {
        float fnum = Float.parseFloat(num1.getText().toString());
        float snum = Float.parseFloat(num2.getText().toString());

        result.setText(String.valueOf(fnum + snum));
    }
}