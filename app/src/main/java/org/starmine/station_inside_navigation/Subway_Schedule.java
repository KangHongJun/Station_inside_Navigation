package org.starmine.station_inside_navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.tabs.TabLayout;

import fragment.Fragment_Holiday;
import fragment.Fragment_Saturday;
import fragment.Fragment_Weekday;

//지하철 시간표
public class Subway_Schedule extends AppCompatActivity {


    Fragment_Weekday Weekday;
    Fragment_Saturday Saturday;
    Fragment_Holiday Holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subway_schedule);


        Weekday = new Fragment_Weekday();
        Saturday = new Fragment_Saturday();
        Holiday = new Fragment_Holiday();

        getSupportFragmentManager().beginTransaction().replace(R.id.Schedule_Container,Weekday).commit();

        @SuppressLint("WrongViewCast")
        TabLayout tabs = findViewById(R.id.Tab_Schedule);
        tabs.addTab(tabs.newTab().setText("평일"));
        tabs.addTab(tabs.newTab().setText("토요일"));
        tabs.addTab(tabs.newTab().setText("공휴일"));


        //클릭 시 fragment 변경
        tabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                Log.d("subway_schedule","선택된 탭"+ position);

                Fragment selected = null;
                if (position == 0){
                    selected = Weekday;
                }else if (position == 1){
                    selected = Saturday;
                }else if (position == 2){
                    selected = Holiday;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.Schedule_Container,selected).commit();
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    //메뉴 적용
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.schedule_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                // 액티비티 이동
                finish();
                return true;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
