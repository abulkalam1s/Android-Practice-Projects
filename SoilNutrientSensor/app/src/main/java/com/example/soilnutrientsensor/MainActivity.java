package com.example.soilnutrientsensor;

import static android.content.ContentValues.TAG;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    TextView nV,pV,kV,mV,tV;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        nV = findViewById(R.id.nitrogenTxt);
        pV = findViewById(R.id.phosphorusTxt);
        kV = findViewById(R.id.potassiumTxt);
        mV = findViewById(R.id.moistureTxt);
        tV = findViewById(R.id.temperatureTxt);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference mRef = database.getReference("sensorData");

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (snapshot.exists()) {
                    String val1 = snapshot.child("moisture").getValue(String.class);
                    String val2 = snapshot.child("nitrogen").getValue(String.class);
                    String val3 = snapshot.child("phosphorus").getValue(String.class);
                    String val4 = snapshot.child("potassium").getValue(String.class);
                    String val5 = snapshot.child("temperature").getValue(String.class);

                    mV.setText(val1+"%");
                    nV.setText(val2+"%");
                    pV.setText(val3+"%");
                    kV.setText(val4+"%");
                    tV.setText(val5+"%");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Log.w(TAG, "Failed to read values", error.toException());
            }
        });
    }
}