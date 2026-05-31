package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import net.engineeringdigest.journalApp.entity.User;

public interface UserRepository extends MongoRepository<User, ObjectId> {
    User findByUserName(String username);
    void deleteByUserName(String username);
}
