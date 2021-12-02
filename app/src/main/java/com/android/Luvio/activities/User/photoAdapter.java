package com.android.Luvio.activities.User;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

class PhotoAdapter extends FragmentStateAdapter {


    private List<Photo> mlistPhoto;

    public PhotoAdapter(@NonNull FragmentActivity fragmentActivity,List<Photo>list) {
        super(fragmentActivity);
        this.mlistPhoto = list;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Photo photo= mlistPhoto.get(position);
        Bundle bundle = new Bundle();
        bundle.putSerializable("object photo", photo);

        PhotoFragment photoFragment = new PhotoFragment();
        photoFragment.setArguments(bundle);
        return photoFragment;
    }

    @Override
    public int getItemCount() {
        if(mlistPhoto!= null){
            return mlistPhoto.size();
        }
        return 0;
    }
}
