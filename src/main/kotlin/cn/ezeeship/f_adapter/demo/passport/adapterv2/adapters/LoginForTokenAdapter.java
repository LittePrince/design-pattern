package cn.ezeeship.f_adapter.demo.passport.adapterv2.adapters;


import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
