package com.safframework.study.operator.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.jakewharton.rxbinding2.view.RxView;
import com.safframework.injectview.Injector;
import com.safframework.injectview.annotations.InjectView;
import com.safframework.log.L;
import com.safframework.router.Router;
import com.safframework.study.operator.R;
import com.safframework.study.operator.app.BaseFragment;
import com.safframework.study.operator.utils.RxUtils;

import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/**
 * Created by tony on 2017/11/4.
 */

public class CreateFragment extends BaseFragment {

    @InjectView(R.id.text1)
    TextView createView;

    @InjectView(R.id.text2)
    TextView justView;

    @InjectView(R.id.text3)
    TextView fromView;

    @InjectView(R.id.text4)
    TextView repeatView;

    @InjectView(R.id.text5)
    TextView deferView;

    @InjectView(R.id.text6)
    TextView intervalView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_create, container, false);
        Injector.injectInto(this, v);

        initViews();

        return v;
    }

    private void initViews() {
        RxView.clicks(createView)
                .compose(RxUtils.routerUriTransformer(createView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });

        RxView.clicks(justView)
                .compose(RxUtils.routerUriTransformer(justView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });

        RxView.clicks(fromView)
                .compose(RxUtils.routerUriTransformer(fromView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });

        RxView.clicks(repeatView)
                .compose(RxUtils.routerUriTransformer(repeatView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });

        RxView.clicks(deferView)
                .compose(RxUtils.routerUriTransformer(deferView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });

        RxView.clicks(intervalView)
                .compose(RxUtils.routerUriTransformer(intervalView))
                .compose(RxUtils.<String>useRxViewTransformer(CreateFragment.this))
                .subscribe(new Consumer<String>() {

                    @Override
                    public void accept(String s) throws Exception {

                        Router.getInstance().open(s);
                    }
                });
    }
}
