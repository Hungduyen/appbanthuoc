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
    ArrayList<Thuoc> arrayList;
    Adapter_thuoc adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listviewthuoc);
        arrayList = new ArrayList<>();
        arrayList.add(new Thuoc( "TRƯƠNG THỊ HOA","Cấp bậc: Thượng úy", "Nơi công tác: Hà Nội","Việt nam", "Số Sao: 2", R.drawable.img));
        arrayList.add(new Thuoc( "TRẦN ĐÌNH PHONG","Cấp bậc: Thiếu tá", "Nơi công tác: Hải phòng","Việt nam", "Số Sao: 1", R.drawable.img));
        arrayList.add(new Thuoc( "NGUYỄN VĂN DIỆM","Cấp bậc: Thượng úy", "Nơi công tác: Hà Nội","Việt nam", "Số Sao: 2", R.drawable.img));
        arrayList.add(new Thuoc( "NGUYỄN LÂM","Cấp bậc: Đại úy", "Nơi công tác: Nghệ An","Việt nam", "Số Sao: 1", R.drawable.img));


        adapter = new Adapter_thuoc( MainActivity2.this,R.layout.layout_monan, arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,panadol.class);
                    startActivity(intent);
                }
//                if(position==1){
//                    Intent intent = new Intent();
//                    intent.setClass(MainActivity2.this,Trandinhphong.class);
//                    startActivity(intent);
//                }
//                if(position==2){
//                    Intent intent = new Intent();
//                    intent.setClass(MainActivity2.this,Nguyenvandiem.class);
//                    startActivity(intent);
//                }
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