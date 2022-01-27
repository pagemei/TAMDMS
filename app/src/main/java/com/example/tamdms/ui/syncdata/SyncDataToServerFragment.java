package com.example.tamdms.ui.syncdata;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tamdms.R;

public class SyncDataToServerFragment extends Fragment {

    private SyncDataToServerViewModel mViewModel;

    public static SyncDataToServerFragment newInstance() {
        return new SyncDataToServerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sync_data_to_server_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(SyncDataToServerViewModel.class);
        // TODO: Use the ViewModel
    }

}