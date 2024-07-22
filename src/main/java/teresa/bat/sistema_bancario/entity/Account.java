package teresa.bat.sistema_bancario.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import teresa.bat.sistema_bancario.entity.enums.AccountStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Document(collection = "accounts")
@NoArgsConstructor
public class Account {

    @Id
    private String id;
    private Long accountNumber;
    private BigDecimal balance;
    private String accountHolder;
    private String password;
    private LocalDateTime openingDate;
    private AccountStatus accountStatus;

    public Account(AccountDto accountDto) {
        this.balance = balance;
        this.accountHolder = accountHolder;
        this.openingDate = openingDate;
        this.password = password;
        this.accountStatus = accountStatus;
    }

   /* public String encryptPassword(String rawPassword) {
        return new BCryptPasswordEncoder().encode(rawPassword);
    }*/
}
