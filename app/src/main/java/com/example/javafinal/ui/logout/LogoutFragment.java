package com.example.javafinal.ui.logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.javafinal.OpenView;
import com.example.javafinal.databinding.FragmentLogoutBinding;
import com.google.firebase.auth.FirebaseAuth;

public class LogoutFragment extends Fragment {
    private FragmentLogoutBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLogoutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button btnlogout = binding.logout;
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();

                startActivity(new Intent(getActivity(), OpenView.class));
                getActivity().finish();
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