package cn.ezeeship.f_adapter.demo.passport.adapterv2.adapters;


import cn.ezeeship.f_adapter.demo.passport.ResultMsg;

/**
 * lxc
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
