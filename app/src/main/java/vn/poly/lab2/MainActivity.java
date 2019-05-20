package vn.poly.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edtNumberOne;

    private EditText edtNumberTwo;

    private Button btnAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // tham chieu giao dien
        edtNumberOne = findViewById(R.id.edtNumberOne);
        edtNumberTwo = findViewById(R.id.edtNumberTwo);

        btnAdd = findViewById(R.id.btnAdd);


    }

    public void calAdd(View view) {
        String numberOne = edtNumberOne.getText().toString();

        String numberTwo = edtNumberTwo.getText().toString();

        int total = Integer.parseInt(numberOne) + Integer.parseInt(numberTwo);

        Log.e("Total", String.valueOf(total));


        Intent intent = new Intent(MainActivity.this, SubActivity.class);


        intent.putExtra("total", total);


        startActivity(intent);

    }
}
