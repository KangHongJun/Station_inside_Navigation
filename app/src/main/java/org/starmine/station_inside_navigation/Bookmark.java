package org.starmine.station_inside_navigation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import org.starmine.station_inside_navigation.R;

public class Bookmark extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookmark);

        //툴바 세팅
        Toolbar toolbar = findViewById(R.id.Bookmark_Toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
    //메뉴적용
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.bookmark_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }
    //메뉴 클릭시
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:{ //toolbar의 back키 눌렀을 때 동작
                // 액티비티 이동
                finish();
                return true;
            }
        }
        int curId = item.getItemId();
        switch (curId){
            case R.id.bookmark_add: //북마크 추가
                Toast.makeText(this,"즐겨찾기 추가",Toast.LENGTH_LONG).show();
                break;

            case R.id.bookmark_delete: //북마크 삭제
                Toast.makeText(this,"즐겨찾기 삭제",Toast.LENGTH_LONG).show();
                break;

            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}