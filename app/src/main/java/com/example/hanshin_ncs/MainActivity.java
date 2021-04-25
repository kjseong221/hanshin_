package com.example.hanshin_ncs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

//    GridView gridView; //이미지를 위한 그리드 뷰
    BottomNavigationView bottomNavigationView; //바텀 네비게이션 뷰

    private FragmentManager fm;
    private FragmentTransaction ft;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
                switch (menuitem.getItemId()) {
                    case R.id.item_fragment1:
                        setFrag(0);
                        break;
                    case R.id.item_fragment2:
                        setFrag(1);
                        break;
                    case R.id.item_fragment3:
                        setFrag(2);
                        break;
                    case R.id.item_fragment4:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        setFrag(0); //첫 화면 지정
    }

    private void setFrag(int n) {
        //프레그먼트 교체
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();
        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, fragment1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, fragment2);
                ft.commit();
                break;
            case 2:
                ft.replace(R.id.main_frame, fragment3);
                ft.commit();
                break;
            case 3:
                ft.replace(R.id.main_frame, fragment4);
                ft.commit();
                break;
        }
    }
}
