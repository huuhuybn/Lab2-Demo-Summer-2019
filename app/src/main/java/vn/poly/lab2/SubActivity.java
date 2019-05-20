package vn.poly.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {


    private TextView tvTotal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        tvTotal = findViewById(R.id.tvTotal);

        int total = getIntent().getIntExtra("total",-1);
        if (total<0){
            // ko lay dc gia tri
        }else {

            tvTotal.setText(String.valueOf(total));

        }
    }
}
