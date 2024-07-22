package teresa.bat.sistema_bancario.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import teresa.bat.sistema_bancario.entity.Account;
import teresa.bat.sistema_bancario.entity.AccountDto;
import teresa.bat.sistema_bancario.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Account> create(@RequestBody AccountDto accountDto) {
        Account newAccount = this.service.createAccount(accountDto);
        return ResponseEntity.ok(newAccount);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAll() {
        List<Account> categories = this.service.getAll();
        return ResponseEntity.ok(categories);
    }

    @GetMapping("{id}")
    public ResponseEntity<List<Account>> findById(@PathVariable("id") String id){
        List<Account> newAccount = this.service.getById(id);
        return ResponseEntity.ok().body(newAccount);
    }
}
