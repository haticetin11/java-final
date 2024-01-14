package com.example.javafinal.ui.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.javafinal.databinding.FragmentAboutBinding;

public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button btnmail = binding.email;
        btnmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(Intent.ACTION_SEND);
                i1.setType("text/plain");
                i1.putExtra(Intent.EXTRA_EMAIL, new String[] {"haticecetin@gmail.com"});
                if(i1.resolveActivity(getActivity().getPackageManager()) != null){
                    startActivity(i1);
                }
            }
        });

        Button btnlinkdln = binding.Linkdln;
        btnlinkdln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url1 = "https://www.linkedin.com/in/hatice-%C3%A7etin-a597b4237/";
                Intent i2 = new Intent(Intent.ACTION_VIEW);
                i2.setData(Uri.parse(url1));
                startActivity(i2);
            }
        });
        Button btngithub = binding.github;
        btngithub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url2 = "https://github.com/haticetin11";
                Intent i3 = new Intent(Intent.ACTION_VIEW);
                i3.setData(Uri.parse(url2));
                startActivity(i3);
            }
        });

        return root;

    }
    @Override
    public  void onDestroyView(){
        super.onDestroyView();
        binding = null;
    }
}


