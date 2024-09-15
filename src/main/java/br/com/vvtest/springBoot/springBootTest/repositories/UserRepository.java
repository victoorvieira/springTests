package br.com.vvtest.springBoot.springBootTest.repositories;

import br.com.vvtest.springBoot.springBootTest.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
