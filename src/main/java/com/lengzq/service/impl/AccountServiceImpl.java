package com.lengzq.service.impl;

import com.lengzq.mapper.AccountMapper;
import com.lengzq.model.Account;
import com.lengzq.service.AccountService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    Logger log = Logger.getLogger(AccountServiceImpl.class);
    public Map<String, Object> addAccount(Account account) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(account==null){
            log.debug("addAccount:account is an invalid parameter");
            map.put("opResult","3");
            return map;
        }
        try {
            int activeLines = accountMapper.insertSelective(account);
            if(activeLines>0){
                map.put("opResult","0");
            }else {
                map.put("opResult","1");
            }
        }catch (Exception e){
            log.error("There are errors in code");
            e.printStackTrace();
            map.put("opResult","2");
            return  map;
        }
        return map;
    }

    public Map<String, Object> updateAccount(Account account) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(account==null){
            log.debug("addAccount:account is an invalid parameter");
            map.put("opResult","3");
            return map;
        }
        try {
            int activeLines = accountMapper.updateByPrimaryKeySelective(account);
            if(activeLines>0){
                map.put("opResult","0");
            }else {
                map.put("opResult","1");
            }
        }catch (Exception e){
            log.error("There are errors in code");
            e.printStackTrace();
            map.put("opResult","2");
            return  map;
        }
        return map;
    }

    public Map<String, Object> loadAccount(Long accountId) {
        Map<String,Object> map = new HashMap<String, Object>();
        if(accountId==null||accountId==0){
            log.debug("addAccount:accountId is an invalid parameter");
            map.put("opResult","3");
            return map;
        }
        try {
            Account account = accountMapper.selectByPrimaryKey(accountId);
            if(account!=null){
                map.put("opResult","0");
                map.put("account",account);
            }else {
                map.put("opResult","1");
            }
        }catch (Exception e){
            log.error("There are errors in code");
            e.printStackTrace();
            map.put("opResult","2");
            return  map;
        }
        return map;
    }
}
