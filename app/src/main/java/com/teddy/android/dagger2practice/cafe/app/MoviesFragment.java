package com.teddy.android.dagger2practice.cafe.app;

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

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;

public class MoviesFragment extends Fragment implements MovieFragmentContract.View {

    @Inject
    MovieFragmentContract.Presenter mPresenter;

    private ListView mMovideListView;

    public static Fragment newInstance(String category) {
        MoviesFragment moviesFragment = new MoviesFragment();

        Bundle bundle = new Bundle();
        bundle.putString("category", category);
        moviesFragment.setArguments(bundle);
        return moviesFragment;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        mMovideListView = view.findViewById(R.id.movies);
        mPresenter.loadMovies(getArguments().getString("category"));
    }

    @Override
    public void setList(List<String> categories) {
        ArrayAdapter<String> adapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_1, categories.toArray());
        mMovideListView.setAdapter(adapter);
    }
}
