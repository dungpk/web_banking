package com.codegym.haichanbank.service.AccountService;

import com.codegym.haichanbank.model.Accounts;
import com.codegym.haichanbank.service.IGeneralService;

import java.util.List;

public interface IAccountService extends IGeneralService<Accounts> {
    Accounts findByCustomerId(int customerId);

    Accounts getAccountDetails(String email);


}
