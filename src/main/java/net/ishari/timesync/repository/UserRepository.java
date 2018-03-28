package net.ishari.timesync.repository;

import net.ishari.timesync.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
