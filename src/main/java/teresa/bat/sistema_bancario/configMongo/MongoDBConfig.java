package teresa.bat.sistema_bancario.configMongo;


import com.mongodb.client.MongoDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoDBConfig {

    @Bean
    public MongoDatabase mongoConfigure() {
        return (MongoDatabase) new SimpleMongoClientDatabaseFactory("mongodb://localhost:27017/bank-system-db");
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate((MongoDatabaseFactory) mongoConfigure());
    }
}
