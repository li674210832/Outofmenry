package otomp.ln.com.outofmenry.activity;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;

import otomp.ln.com.outofmenry.R;
import otomp.ln.com.outofmenry.UserUtils;


public class InnerClassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inner_class);
        //开一个子线程
        //demo1();
        demo2();
    }

    private void demo1() {
        new Thread(){
            public void run() {
                //模拟耗时操作
                SystemClock.sleep(100000);
            };
        }.start();
    }


    private void demo2() {
        UserUtils.setUser(new User("ycf"));


    }

    //B.定义一个内部类
    /*  解决非静态内部类错误？
       1.切断activity与内部类的联系（在class前面加个  static）
    *  2.把内部类抽出来。也就是不使用内部类，从新建一个类
    * */
   // public class User{
    public static class User{

        private String name;

        public User(String name) {
            this.name = name;
        }
    }

}
