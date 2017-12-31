package com.lengzq.service;

import com.lengzq.model.Account;

import java.util.Map;

public interface AccountService {
    public Map<String,Object> addAccount(Account account);
    public Map<String,Object> updateAccount(Account account);
    public Map<String,Object> loadAccount(Long accountId);
}
