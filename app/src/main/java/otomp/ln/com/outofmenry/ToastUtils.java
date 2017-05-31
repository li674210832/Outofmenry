package otomp.ln.com.outofmenry;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Lenovo on 2017/5/31.
 * author ：李宁
 * 类注释：
 */

public class ToastUtils {
    private static Toast sToast;

    public static void showToast(Context context, String msg) {
        if (sToast == null){
//            sToast =Toast.makeText(context,msg,Toast.LENGTH_SHORT);
            //解决方法
            /*让静态的sToast使用全局的applaction上下文即可,
              这样就和Activity没有关系了，Activity就会关闭后自动回收掉
            * */
        sToast =Toast.makeText(context.getApplicationContext(),msg,Toast.LENGTH_SHORT);

        }
        //重新设置Toast弹的文本
        sToast.setText(msg);
        sToast.show();
    }


}
