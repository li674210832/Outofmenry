package otomp.ln.com.outofmenry.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.Date;

import otomp.ln.com.outofmenry.R;
import otomp.ln.com.outofmenry.ToastUtils;


public class ToastActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast);
        initView();
    }
    private void initView() {
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
//                Toast.makeText(ToastActivity.this, ""+new Date().getTime(), Toast.LENGTH_SHORT).show();
                ToastUtils.showToast(this,"单例的吐司" +new Date().getTime());
                break;
        }  

    }


}
