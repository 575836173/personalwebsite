package com.lengzq.controller;

import com.lengzq.model.Account;
import com.lengzq.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/addAccount")
    @ResponseBody
    public Map<String,Object> addAccount(Account account){
        return accountService.addAccount(account);
    }
    @RequestMapping("/updateAccount")
    @ResponseBody
    public Map<String,Object> updateAccount(Account account){
        return accountService.updateAccount(account);
    }
    @RequestMapping("/loadAccount")
    @ResponseBody
    public Map<String,Object> loadAccount(Long accountId){
        return accountService.loadAccount(accountId);
    }
}
