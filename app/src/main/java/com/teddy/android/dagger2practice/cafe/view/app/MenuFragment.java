package com.teddy.android.dagger2practice.cafe.view.app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.teddy.android.dagger2practice.cafe.R;
import com.teddy.android.dagger2practice.cafe.presenter.MenuFragmentContract;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class MenuFragment extends Fragment implements MenuFragmentContract.View {

    @Inject
    MenuFragmentContract.Presenter mPresenter;

    private ListView mMenuListView;

    public static Fragment newInstance(String category) {
        MenuFragment menuFragment = new MenuFragment();

        Bundle bundle = new Bundle();
        bundle.putString("category", category);
        menuFragment.setArguments(bundle);
        return menuFragment;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mMenuListView = view.findViewById(R.id.menu);
        mPresenter.loadMenu(getArguments().getString("category"));
    }

    @Override
    public void setList(List<String> categories) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, (String[]) categories.toArray());
        mMenuListView.setAdapter(adapter);
    }
}
