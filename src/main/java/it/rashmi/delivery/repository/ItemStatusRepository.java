package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.ItemStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemStatusRepository extends JpaRepository<ItemStatus,Integer>
{
}
