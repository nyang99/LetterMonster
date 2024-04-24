package com.lemon.backend.domain.users.user.repository;

import com.lemon.backend.domain.users.user.entity.Social;
import com.lemon.backend.domain.users.user.entity.Users;
import com.lemon.backend.domain.users.user.repository.custom.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Integer>, UserRepositoryCustom {


    long countByNickname(String nickname);

    Optional<Users> findByProviderAndProviderId(Social social, String providerId);

    @Query("select u from Users u left join fetch u.characterList")
    Optional<Users> findByIdFetch(int userId);

}
