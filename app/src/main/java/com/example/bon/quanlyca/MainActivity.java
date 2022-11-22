package com.example.bon.quanlyca;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView lvCa;
    private ArrayList<Ca> caSiArrayList;
    private  CaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCa = findViewById(R.id.lvCa);

        caSiArrayList = new ArrayList<>();
        getData();
        adapter = new CaAdapter(this,R.layout.item_listview,caSiArrayList);
        lvCa.setAdapter(adapter);
    }
    private  void getData(){
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("QuanLyCaSi");
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        })

}