package com.briup.ui.user;

import android.widget.Button;
import com.briup.R;
import com.briup.frame.bean.InfoResult;
import com.briup.frame.ui.activity.BaseActivity;
import butterknife.BindView;

public class LoginActivity extends BaseActivity {

    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    public boolean isSupportSwipeBack() {
        return false;
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_login;
    }

    @Override
    public void init() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void onSuccess(int what, InfoResult t) {

    }

    @Override
    public void onFail(int what, InfoResult t) {

    }
}
