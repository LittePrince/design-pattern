package cn.ezeeship.b_decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * lxc
 */
public class JsonLoggerFactory {

    public static JsonLogger getLogger(Class clazz){
        Logger logger = LoggerFactory.getLogger(clazz);
        return new JsonLogger(logger);
    }
}
