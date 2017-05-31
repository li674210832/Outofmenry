package otomp.ln.com.outofmenry.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

import otomp.ln.com.outofmenry.R;


public class HandlerActivity extends AppCompatActivity {
      Handler mHandler=new Handler();
    public TextView  tv_time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
         tv_time= (TextView) findViewById(R.id.tv_time);
        handlerTime();
    }

    private void handlerTime() {
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                tv_time.setText(getTimeString());
                mHandler.postDelayed(this,1000);
            }
        },1000);
    }

    //格式化时间
    private String getTimeString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //清空移除所有的回调和任务
        mHandler.removeCallbacksAndMessages(null);
    }
}
