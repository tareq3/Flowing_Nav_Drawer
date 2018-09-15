/*
 * Created by Tareq Islam on 9/15/18 12:11 PM
 *
 *  Last modified 9/15/18 12:11 PM
 */

package com.mti.navigation_drawer_adv;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/***
 * Created by Tareq on 15,September,2018.
 */
public class NavigationDrawerFragment extends Fragment implements NavigationView.OnNavigationItemSelectedListener {

    private ImageView ivMenuUserProfilePhoto;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.drawer_body, container,
                false);
        ivMenuUserProfilePhoto = (ImageView) view.findViewById(R.id.profilePic);
        NavigationView vNavigation = (NavigationView) view.findViewById(R.id.vNavigation);
        vNavigation.setNavigationItemSelectedListener(this) ;
        setupHeader();
        return  view ;
    }

    private void setupHeader() {
       // int avatarSize = getResources().getDimensionPixelSize(R.dimen.global_menu_avatar_size);
       // String profilePhoto = getResources().getString(R.string.user_profile_photo);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Toast.makeText(getActivity(),menuItem.getTitle(),Toast.LENGTH_SHORT).show();
        return false;
    }
}