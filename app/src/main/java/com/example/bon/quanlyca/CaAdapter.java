package com.example.bon.quanlyca;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class CaAdapter extends ArrayAdapter<Ca> {

    @NonNull
    private Activity activity;
    private int resource;
    @NonNull
    private List<Ca> objects;
    public CaAdapter(@NonNull Activity activity, int resource, @NonNull List<Ca> objects) {
        super(activity, resource, objects);
        this.activity = activity;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.activity.getLayoutInflater();
        View view = inflater.inflate(this.resource, null);

        TextView txtTen = view.findViewById(R.id.txtTen);
        TextView txtNghedanh = view.findViewById(R.id.txtNghedanh);
        TextView txtQuocgia = view.findViewById(R.id.txtmau);

        Ca caSi = this.objects.get(position) ;
        txtTen.setText(caSi.getTenkhoahoc());
        txtNghedanh.setText(caSi.getTenthuonggoi());
        txtQuocgia.setText(caSi.getMau());

        ImageView menu = view.findViewById(R.id.menu);

        return view;
    }
}
