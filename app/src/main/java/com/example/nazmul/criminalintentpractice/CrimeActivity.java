package com.example.nazmul.criminalintentpractice;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CrimeActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}