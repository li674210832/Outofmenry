package otomp.ln.com.outofmenry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import otomp.ln.com.outofmenry.activity.HandlerActivity;
import otomp.ln.com.outofmenry.activity.InnerClassActivity;
import otomp.ln.com.outofmenry.activity.ToastActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        您奶奶
    }

    public void innerClass(View view){
        Intent intent = new Intent(this, InnerClassActivity.class);
        startActivity(intent);
    }

    public void handler(View view){
        Intent intent = new Intent(this, HandlerActivity.class);
        startActivity(intent);
    }

    //如果我们的单例引用到了Activity，那么就会导致Activity无法被GC回收，从而导致内存泄露。
    public void showToast(View view){
        Intent intent = new Intent(this,ToastActivity.class);
        startActivity(intent);

    }
}
