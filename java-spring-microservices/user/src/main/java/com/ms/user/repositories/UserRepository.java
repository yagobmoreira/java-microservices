package com.ms.user.repositories;

import com.ms.user.models.UserModel;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserModel, UUID> {

}
