package com.example.soilnutrientdetector.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.soilnutrientdetector.R;
import com.example.soilnutrientdetector.databinding.FragmentHomeBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;

import java.util.Map;
import java.util.Objects;

public class HomeFragment extends Fragment {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    private FragmentHomeBinding binding;



    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View view = binding.getRoot();


        db.collection("soil-data").get().addOnSuccessListener(documentSnapshot -> {
            for (QueryDocumentSnapshot document : documentSnapshot) {
                Map<String, Object> data = document.getData();
                // Example: Accessing a field named "fieldName"

                // Update UI with the retrieved data
                binding.nitrogenTxt.setText(Objects.requireNonNull(data.get("nitrogen")).toString() + "%");
                binding.phosphorusTxt.setText(Objects.requireNonNull(data.get("phosphorus")).toString() + "%");
                binding.potassiumTxt.setText(Objects.requireNonNull(data.get("potassium")).toString() + "%");
                binding.moistureTxt.setText(Objects.requireNonNull(data.get("moisture")).toString() + "%");
              //  binding.textView7.setText(Objects.requireNonNull(data.get("nitrogen")).toString() + "%");
            }


        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Log.w("TAG", "Error reading document", e);
            }
        });

        return view;
    }
}