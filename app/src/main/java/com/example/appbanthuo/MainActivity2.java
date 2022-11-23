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
        arrayList.add(new Thuoc( "Panadol Extra", "Vỉ 12 viên", "", "","", "", R.drawable.img));
        arrayList.add(new Thuoc( "Hoạt huyết Nhất Nhất", "Vỉ 20 viên", "", "","", "", R.drawable.img_1));
        arrayList.add(new Thuoc( "Nước muối sinh lý", "Chai 1 lít", "", "","", "", R.drawable.img_2));

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
                if(position==1){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,hoathuyet.class);
                    startActivity(intent);
                }
                if(position==2){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity2.this,nuocmuoi.class);
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