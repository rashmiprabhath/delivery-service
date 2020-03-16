package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.SupplierType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierTypeRepository extends JpaRepository<SupplierType,Integer>
{
}
