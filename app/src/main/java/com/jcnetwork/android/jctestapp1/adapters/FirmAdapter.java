package com.jcnetwork.android.jctestapp1.adapters;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.jcnetwork.android.jctestapp1.fragments.FirmFragment;
import com.jcnetwork.android.jctestapp1.models.Firm;

import java.util.ArrayList;
import java.util.List;

public class FirmAdapter extends FragmentStateAdapter {

    // Variables
    private List<Firm> firms;
    private Context mContext;

    /**
     * Constructor
     * @param fragmentActivity fragment activity from super class
     */
    public FirmAdapter(@NonNull FragmentActivity fragmentActivity, Context context) {
        super(fragmentActivity);
        firms = new ArrayList<>();
        mContext = context;
    }

    // Method to add a new firm
    public void addFirm(Firm firm) {
        firms.add(firm);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Get firm based on position
        Firm currentFirm = firms.get(position);
        return new FirmFragment(currentFirm, mContext);
    }

    @Override
    public int getItemCount() {
        return  firms.size();
    }

}
