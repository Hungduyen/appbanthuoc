package com.example.appbanthuo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adapter_congan extends BaseAdapter {

    private Context context;
    private int layout;
    private List<Congan> arraylist;

    public Adapter_congan(Context context, int layout, List<Congan> arraylist) {
        this.context = context;
        this.layout = layout;
        this.arraylist = arraylist;
    }



    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        Congan monan = arraylist.get(position);

        TextView text1 = view.findViewById(R.id.hoten);
        TextView text2 = view.findViewById(R.id.capbac);
        TextView text3 = view.findViewById(R.id.noicongtac);
        TextView text4 = view.findViewById(R.id.quocgia);
        TextView text5 = view.findViewById(R.id.sosao);
        ImageView imageV = view.findViewById(R.id.imageHinh);

        text1.setText(monan.getHoten());
        text2.setText(monan.getCapbac());
        text3.setText(monan.getNoicongtac());
        text4.setText(monan.getQuocgia());
        text5.setText(monan.getSosao());
        imageV.setImageResource(monan.getHinh());

        return view;
    }
}
