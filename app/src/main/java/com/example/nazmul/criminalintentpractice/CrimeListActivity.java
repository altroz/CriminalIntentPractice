package com.example.nazmul.criminalintentpractice;

import android.support.v4.app.Fragment;

/**
 * Created by Ram Rooter on 11/2/2016.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
