package com.walladog.walladog.adapters;



import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;


import com.walladog.walladog.controllers.fragments.ServiceFragment;
import com.walladog.walladog.models.WDServices;

import java.util.List;

/**
 * Created by hadock on 12/12/15.
 *
 */

public class ServicesPagerAdapter extends FragmentPagerAdapter {

    private List<WDServices> mServices;

    public ServicesPagerAdapter(android.support.v4.app.FragmentManager fm, List<WDServices> services) {
        super(fm);
        mServices=services;
    }

    @Override
    public int getCount() {
        return mServices.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mServices.get(position).getName();
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new ServiceFragment();
        Bundle arguments = new Bundle();
        arguments.putSerializable(ServiceFragment.ARG_WDSERVICE,mServices.get(position));
        fragment.setArguments(arguments);
        return fragment;
    }
}