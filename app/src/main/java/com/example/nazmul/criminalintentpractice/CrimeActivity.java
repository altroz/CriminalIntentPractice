package com.example.nazmul.criminalintentpractice;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.awt.font.TextAttribute;
import java.util.UUID;

public class CrimeActivity extends SingleFragmentActivity {

    protected Fragment createFragment(){
       return new CrimeFragment();
    }
}
