package teresa.bat.sistema_bancario.service;

import org.springframework.stereotype.Service;
import teresa.bat.sistema_bancario.entity.Account;
import teresa.bat.sistema_bancario.entity.AccountDto;
import teresa.bat.sistema_bancario.repository.AccountRepository;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository repository;

    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account createAccount(AccountDto accountDto) {
        Account newAccount = new Account(accountDto);
        newAccount.setAccountNumber(accountNumber());
        this.repository.save(newAccount);
        return newAccount;
    }

    public List<Account> getAll(){
        return this.repository.findAll();
    }

    /*public Optional<Account> getById(String id){
        return this.repository.findAll();
    }*/

    public List<Account> getById(String id){
        return this.repository.findAll();
    }

    private Long accountNumber() {
        var intSize = this.repository.findAll().size();
        return (long) intSize+1;
    }
}
