package com.example.myapplication4.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication4.R;
import com.example.myapplication4.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {

    private FragmentBlankBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBlankBinding.inflate(inflater);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        applyClick();

    }

    private void applyClick() {
        binding.btAllah.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_blankFragment_to_blankFragment2);
        });
        binding.btBlack.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_blankFragment_to_blankFragment3);
        });
        binding.btWhite.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_blankFragment_to_blankFragment4);
        });
        binding.btBlue.setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_blankFragment_to_blankFragment5);
        });
    }
}