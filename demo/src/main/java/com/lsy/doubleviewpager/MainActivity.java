package com.lsy.doubleviewpager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.lsy.view.DbVPager;
import com.lsy.view.model.ImgGroups;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ImgGroups> dataSource;
    DbVPager mWidget;
    TextView tv_showText;
    TextView btn_website;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataSource();
        mWidget = (DbVPager) findViewById(R.id.db_vpager);
        tv_showText = (TextView) findViewById(R.id.tv_showText);
        btn_website = (TextView) findViewById(R.id.btn_website);
        btn_website.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if (TextUtils.isEmpty(btn_website.getText())) {
                    return false;
                }
                ClipboardManager manager = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData data = ClipData.newPlainText("Lable", btn_website.getText());
                manager.setPrimaryClip(data);
                Toast.makeText(MainActivity.this, "复制成功", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        mWidget.setBarPosition(DbVPager.BarPositon.BOTTOM);
        mWidget.setSource(dataSource);
        tv_showText.setText("当前分类：" + dataSource.get(0).groupName);
        mWidget.addTabChangeListenr(new DbVPager.DbCallbackListener() {
            @Override
            public void callback(int index, String text) {
                tv_showText.setText("当前分类：" + text);
            }
        });
        mWidget.show();
    }

    private void initDataSource() {
        List<String> imgList1 = new ArrayList<>();
        imgList1.add("http://pic1.win4000.com/wallpaper/2017-10-14/59e1bb8433aa1.jpg");
        imgList1.add("http://pic1.win4000.com/wallpaper/2017-12-19/5a387cb8439ea.jpg");
        imgList1.add("http://image.3761.com/pic/50491421458201.jpg");
        imgList1.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522153194260&di=45299f10160d7afa28a92b3d868f29fc&imgtype=0&src=http%3A%2F%2Fimg1.3lian.com%2F2015%2Fw22%2F87%2Fd%2F105.jpg");
        imgList1.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522153234070&di=f7acf9de19c3b877be40b3778b6c435c&imgtype=0&src=http%3A%2F%2Fpic29.nipic.com%2F20130529%2F7447430_172314315000_2.jpg");
        ImgGroups group1 = new ImgGroups("美女", imgList1);

        List<String> imgList2 = new ArrayList<>();
        imgList2.add("http://images.quanjing.com/corbis018/high/csm106974.jpg");
        imgList2.add("http://img05.tooopen.com/images/20141111/sy_101468553566.jpg");
        imgList2.add("http://c.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=5ceafaa2d6160924dc70aa1fe13719cc/f11f3a292df5e0fe733214f55a6034a85edf7218.jpg");
        imgList2.add("http://k.zol-img.com.cn/dcbbs/22506/a22505575_01000.jpg");
        ImgGroups group2 = new ImgGroups("动物", imgList2);

        List<String> imgList3 = new ArrayList<>();
        imgList3.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522395384&di=c86d854d4e252747cda6d2a1a8d97d7a&imgtype=jpg&er=1&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F32fa828ba61ea8d35e5c44059d0a304e251f58b0.jpg");
        imgList3.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521801001771&di=12d51f53a44968630f523f011e5cd792&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F5%2F53193c4a8dbe6.jpg");
        imgList3.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521801084840&di=5746a7747383255c3b0c3c1201f93a59&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201311%2F28%2F102808lhjhh05b5tp8ph61.jpg");
        ImgGroups group3 = new ImgGroups("风景", imgList3);

        List<String> imgList4 = new ArrayList<>();
        imgList4.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522158291459&di=56ae9a971ef584d7fef85590ff96e8b6&imgtype=0&src=http%3A%2F%2Fimg02.tooopen.com%2Fimages%2F20150625%2Ftooopen_sy_131834161747.jpg");
        imgList4.add("https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=2197870778,952754758&fm=27&gp=0.jpg");
        imgList4.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522158348250&di=434e8c42751be076bc1995db214c7355&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F01cfd156288aa76ac7254878e2c380.jpg");
        ImgGroups group4 = new ImgGroups("建筑", imgList4);

        dataSource = new ArrayList<>();
        dataSource.add(group1);
        dataSource.add(group2);
        dataSource.add(group3);
        dataSource.add(group4);
    }
}
