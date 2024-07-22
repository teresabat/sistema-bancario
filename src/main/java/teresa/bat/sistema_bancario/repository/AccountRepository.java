package teresa.bat.sistema_bancario.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import teresa.bat.sistema_bancario.entity.Account;

public interface AccountRepository extends MongoRepository<Account, String> {
}
