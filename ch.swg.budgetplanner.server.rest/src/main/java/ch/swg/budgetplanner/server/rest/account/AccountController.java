package ch.swg.budgetplanner.server.rest.account;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.swg.budgetplanner.server.persistence.account.Account;
import ch.swg.budgetplanner.server.persistence.account.AccountRepository;

@RestController
public class AccountController {

  @Autowired
  private AccountRepository repository;

  @GetMapping("/accounts")
  public List<Account> getAccounts() {
    return repository.findAll();
  }
}
