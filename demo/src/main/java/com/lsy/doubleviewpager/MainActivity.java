package com.lsy.doubleviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.lsy.view.DbVPager;
import com.lsy.view.model.ImgGroups;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<ImgGroups> dataSource;
    DbVPager mWidget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDataSource();
        mWidget = (DbVPager) findViewById(R.id.db_vpager);
        mWidget.setBarPosition(DbVPager.BarPositon.TOP);
        mWidget.setSource(dataSource);
        mWidget.show();
    }

    private void initDataSource() {
        List<String> imgList1 = new ArrayList<>();
        imgList1.add("http://pic1.win4000.com/wallpaper/2017-10-14/59e1bb8433aa1.jpg");
        imgList1.add("http://pic1.win4000.com/wallpaper/2017-12-19/5a387cb8439ea.jpg");
        imgList1.add("http://image.3761.com/pic/50491421458201.jpg");
        imgList1.add("http://5b0988e595225.cdn.sohucs.com/images/20170810/ac9e3d5a942943839caf47df299ef4bc.jpeg");
        ImgGroups group1 = new ImgGroups("美女", imgList1);

        List<String> imgList2 = new ArrayList<>();
        imgList2.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1522395384&di=c86d854d4e252747cda6d2a1a8d97d7a&imgtype=jpg&er=1&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2F32fa828ba61ea8d35e5c44059d0a304e251f58b0.jpg");
        imgList2.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521801001771&di=12d51f53a44968630f523f011e5cd792&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F5%2F53193c4a8dbe6.jpg");
        imgList2.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1521801084840&di=5746a7747383255c3b0c3c1201f93a59&imgtype=0&src=http%3A%2F%2Fattach.bbs.miui.com%2Fforum%2F201311%2F28%2F102808lhjhh05b5tp8ph61.jpg");
        ImgGroups group2 = new ImgGroups("风景", imgList2);

        dataSource = new ArrayList<>();
        dataSource.add(group1);
        dataSource.add(group2);
    }
}
