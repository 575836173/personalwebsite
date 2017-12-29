package com.lengzq.service.impl;

import com.lengzq.service.LoginService;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lengzq on 2017/12/29.
 */
@Service
public class LoginServiceImpl implements LoginService {
    //@Autowired
    Logger log = Logger.getLogger(LoginServiceImpl.class);
    public Map<String, Object> login(String username, String password) {
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isEmpty(username)||StringUtils.isEmpty(password)){
            log.debug("login:username or password is an invalid parameter");
            map.put("opResult","3");
            return map;
        }
        try {
            if("zhangsan".equals(username)&&"123456".equals(password)){
                map.put("opResult","0");
            }else{
                map.put("opResult","1");
            }
        }catch (Exception e){
            log.error("There are errors in the code");
            map.put("opResult","2");
            return map;
        }
        return map;
    }
}
