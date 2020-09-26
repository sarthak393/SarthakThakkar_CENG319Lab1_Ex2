package com.example.sarthakthakkar_ceng319lab1_ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.ListFragment;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private android.app.Fragment Fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListFragment listFragment = new ListFragment();
        LifeCycleFragment lifeCycleFragment = new LifeCycleFragment();

        // create a FragmentManager
        FragmentManager fm = getFragmentManager();
        // create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        // replace the FrameLayout with new Fragment
        fragmentTransaction.add(R.id.displayList, Fragment, "List_Fragment");
        fragmentTransaction.add(R.id.fragLifeCycle, lifeCycleFragment, "frag_Life_cycle");
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        fragmentTransaction.commit(); // save the changes


        protected void onCreate
        }
        /** Called when the activity is about to become visible. */
        protected void onStart(){
            super.onStart();
            Toast.makeText(this,"onStart", Toast.LENGTH_LONG).show();

    }
}