package com.example.dialogfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MyFrag extends DialogFragment {
    private String title,msg;


    public MyFrag(String title,String msg){
        this.title = title;
        this.msg = msg;
    }
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(getActivity()).setTitle(this.title).setCancelable(true).setMessage(this.msg).create();
    }
}
