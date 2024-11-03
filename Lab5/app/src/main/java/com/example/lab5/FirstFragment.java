package com.example.lab5;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {

    private void logLifecycle(String methodName) {
        Log.e("FirstFragment", methodName);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        logLifecycle("onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logLifecycle("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        logLifecycle("onCreateView");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        logLifecycle("onViewCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        logLifecycle("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        logLifecycle("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        logLifecycle("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        logLifecycle("onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        logLifecycle("onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        logLifecycle("onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        logLifecycle("onDetach");
    }
}
