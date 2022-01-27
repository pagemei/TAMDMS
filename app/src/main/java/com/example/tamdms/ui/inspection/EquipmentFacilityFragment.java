package com.example.tamdms.ui.inspection;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamdms.R;

public class EquipmentFacilityFragment extends Fragment {

    private EquipmentFacilityViewModel mViewModel;

    public static EquipmentFacilityFragment newInstance() {
        return new EquipmentFacilityFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.equipment_facility_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(EquipmentFacilityViewModel.class);
        // TODO: Use the ViewModel
    }

}