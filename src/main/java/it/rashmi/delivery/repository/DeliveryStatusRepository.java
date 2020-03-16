package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.DeliveryStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryStatusRepository extends JpaRepository<DeliveryStatus,Integer>
{
}
