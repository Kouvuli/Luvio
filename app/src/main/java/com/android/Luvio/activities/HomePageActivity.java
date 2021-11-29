package com.android.Luvio.activities;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.android.Luvio.R;
import com.android.Luvio.databinding.ActivityHomePageBinding;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class HomePageActivity extends AppCompatActivity {
    private ActivityHomePageBinding binding;
//    private BottomSheetBehavior sheetBehavior;
//    private LinearLayout filterSheet;

    String[] names = {"P", "T", "T", "T"};
    String[] ages = {"20", "21", "23", "22"};
    String[] stars = {"5", "4.5", "2.5", "3"};
    Integer[] avatars = {R.drawable.photo, R.drawable.photo2, R.drawable.photo3, R.drawable.photo4};
    String[] bios = {"hello", "hola", "anhon", "konichiwa"};


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CustomAdapter adapter = new CustomAdapter(this, R.layout.custom_list, names, ages, stars ,bios, avatars);
        binding.userList.setAdapter(adapter);

//        filterSheet = (LinearLayout) findViewById(R.id.search_filter_sheet);
//        sheetBehavior = BottomSheetBehavior.from(filterSheet);
//        sheetBehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        setListener();


    }

    protected void setListener()
    {
        binding.settingBtn.setOnClickListener(view ->
        {
//            sheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            SearchDialog(R.layout.search_filter);
        });

    }

    private void SearchDialog (int layoutStyle){
        BottomSheetDialogFragment bottomSheetDialogFragment = new SearchFilterActivity(layoutStyle);
        bottomSheetDialogFragment.setShowsDialog(true);
        bottomSheetDialogFragment.show(getSupportFragmentManager(),bottomSheetDialogFragment.getTag());
    }
}