package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.PaymentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentStatusRepository extends JpaRepository<PaymentStatus,Integer>
{
}
