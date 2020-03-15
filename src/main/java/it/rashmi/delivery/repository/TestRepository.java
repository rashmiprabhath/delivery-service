package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test, Long>
{
}
