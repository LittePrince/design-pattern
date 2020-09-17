package cn.ezeeship.f_adapter.demo.passport.adapterv2.adapters;


import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
