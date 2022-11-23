package com.example.appbanthuo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ListView listView;
    ArrayList<Congan> arrayList;
    Adapter_congan adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewthuoc);
        arrayList = new ArrayList<>();
        arrayList.add(new Congan( "TRƯƠNG THỊ HOA","Cấp bậc: Thượng úy", "Nơi công tác: Hà Nội","Việt nam", "Số Sao: 2", R.drawable.img));
        arrayList.add(new Congan( "TRẦN ĐÌNH PHONG","Cấp bậc: Thiếu tá", "Nơi công tác: Hải phòng","Việt nam", "Số Sao: 1", R.drawable.img_1));
        arrayList.add(new Congan( "NGUYỄN VĂN DIỆM","Cấp bậc: Thượng úy", "Nơi công tác: Hà Nội","Việt nam", "Số Sao: 2", R.drawable.img_2));
        arrayList.add(new Congan( "NGUYỄN LÂM","Cấp bậc: Đại úy", "Nơi công tác: Nghệ An","Việt nam", "Số Sao: 1", R.drawable.img_3));
        arrayList.add(new Congan( "VŨ ĐÌNH QUÂN","Cấp bậc: Hạ sỹ", "Nơi công tác: Đà Nẵng","Việt nam", "Số Sao: 2", R.drawable.img_4));
        arrayList.add(new Congan( "MAI THỊ LAN","Cấp bậc: Đại úy", "Nơi công tác: Thành phố Hồ Chí Minh","Việt nam", "Số Sao: 2", R.drawable.img_5));



        adapter = new Adapter_congan( MainActivity2.this,R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Truongthihoa.class);
                    startActivity(intent);
                }
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Trandinhphong.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,Nguyenvandiem.class);
                    startActivity(intent);
                }
//                if(position==1){
//                    Intent intent = new Intent();
//                    intent.setClass(MainActivity2.this,MainActivity5.class);
//                    startActivity(intent);
//                }
//                if(position==2){
//                    Intent intent = new Intent();
//                    intent.setClass(MainActivity2.this,MainActivity6.class);
//                    startActivity(intent);
//                }
            }
        });
//        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
//
//                deleteData(position);
//                return false;
//            }
//        });

//        ButtonControl();
    }
//    private void ButtonControl(){
//        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
//        startActivity(intent);
//    }
}