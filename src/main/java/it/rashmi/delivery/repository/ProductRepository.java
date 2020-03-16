package it.rashmi.delivery.repository;

import it.rashmi.delivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>
{
}
