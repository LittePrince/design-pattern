package cn.ezeeship.f_adapter.demo.passport.adapterv2.adapters;


import cn.ezeeship.f_adapter.demo.passport.PassportService;
import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
