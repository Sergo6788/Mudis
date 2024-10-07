package com.example.myapplication4.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication4.R;
import com.example.myapplication4.databinding.FragmentBlankBinding;


public class BlankFragment4 extends Fragment {
    private FragmentBlankBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentBlankBinding.inflate(inflater);
        return binding.getRoot();
    }
}