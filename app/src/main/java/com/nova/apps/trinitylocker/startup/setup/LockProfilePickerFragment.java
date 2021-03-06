package com.nova.apps.trinitylocker.startup.setup;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorInt;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.paolorotolo.appintro.ISlideBackgroundColorHolder;
import com.nova.apps.trinitylocker.R;

//TODO Finish Intro Fragment for LockProfilePicker
public class LockProfilePickerFragment extends Fragment implements ISlideBackgroundColorHolder {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.intro_lock_profile, container, false);
		return v;
	}

	@Override
	public int getDefaultBackgroundColor() {
		return Color.parseColor("#DBFF33");
	}

	@Override
	public void setBackgroundColor(@ColorInt int backgroundColor) {
		View layoutContainer = getView();

		if(layoutContainer != null){
			layoutContainer.setBackgroundColor(backgroundColor);
		}
	}
}
