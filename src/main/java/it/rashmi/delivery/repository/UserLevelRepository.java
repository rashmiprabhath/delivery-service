package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.UserLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLevelRepository extends JpaRepository<UserLevel,Integer>
{
}
