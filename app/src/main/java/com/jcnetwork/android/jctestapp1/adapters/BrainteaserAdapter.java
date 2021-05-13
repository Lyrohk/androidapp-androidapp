package com.jcnetwork.android.jctestapp1.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jcnetwork.android.jctestapp1.fragments.BrainteaserFragment;
import com.jcnetwork.android.jctestapp1.models.Brainteaser;

import java.util.ArrayList;
import java.util.List;

public class BrainteaserAdapter extends FragmentStateAdapter {

    // Variables
    private List<Brainteaser> bt;

    /**
     * Constructor
     * @param fragmentActivity fragment activity from super class
     */
    public BrainteaserAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        bt = new ArrayList<>();

        // add data
        Brainteaser brain1 = new Brainteaser("X", "Y");
        Brainteaser brain2 = new Brainteaser("A", "B");
        Brainteaser brain3 = new Brainteaser("3", "rd");
        bt.add(brain1);
        bt.add(brain2);
        bt.add(brain3);

    }

    // Method to add a new brainteaser
    public void addBT(Brainteaser teaser) {
        bt.add(teaser);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Get brainteaser based on position
        Brainteaser currentBT = bt.get(position);
        return new BrainteaserFragment(currentBT);
    }

    @Override
    public int getItemCount() {
        return  bt.size();
    }
}