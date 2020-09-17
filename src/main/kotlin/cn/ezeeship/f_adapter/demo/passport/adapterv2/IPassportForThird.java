package cn.ezeeship.f_adapter.demo.passport.adapterv2;


import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public interface IPassportForThird {

    ResultMsg loginForQQ(String openId);

    ResultMsg loginForWechat(String openId);

    ResultMsg loginForToken(String token);

    ResultMsg loginForTelphone(String phone, String code);

}
