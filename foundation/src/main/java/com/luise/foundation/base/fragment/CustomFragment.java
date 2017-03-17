package com.luise.foundation.base.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.luise.common.logger.Logger;

/**
 * Created by john 
 * on 2017/3/16 13:27.
 */

public class CustomFragment extends Fragment {
    @Override
    public void onAttach(Context context) {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onAttach( ) ,attach to ["+context.getClass().getSimpleName()+"]");
        super.onAttach(context);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onCreate( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onCreateView( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onActivityCreated( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onViewStateRestored( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onViewStateRestored(savedInstanceState);
    }

    @Override
    public void onStart() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onStart( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onStart();
    }

    @Override
    public void onResume() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onResume( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onResume();
    }

    @Override
    public void onPause() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onPause( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onPause();
    }

    @Override
    public void onStop() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onStop( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onStop();
    }

    @Override
    public void onDestroyView() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onDestroyView( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onDestroy( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        Logger.debug("fragment["+this.getClass().getSimpleName()+"] ==> onDetach( ) ,in attach context ["+getContext().getClass().getSimpleName()+"]");
        super.onDetach();
    }
}
