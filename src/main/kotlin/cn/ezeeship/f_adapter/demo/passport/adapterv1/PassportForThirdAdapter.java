package cn.ezeeship.f_adapter.demo.passport.adapterv1;


import cn.ezeeship.f_adapter.demo.passport.PassportService;
import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public class PassportForThirdAdapter extends PassportService implements IPassportForThird {

    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForWechat(String openId) {
        return loginForRegist(openId,null);
    }

    public ResultMsg loginForToken(String token) {
        return loginForRegist(token,null);
    }

    public ResultMsg loginForTelphone(String phone, String code) {
        return loginForRegist(phone,null);
    }

    private ResultMsg loginForRegist(String username,String password){
        if(null == password){
            password = "THIRD_EMPTY";
        }
        super.regist(username,password);
        return super.login(username,password);
    }
}
