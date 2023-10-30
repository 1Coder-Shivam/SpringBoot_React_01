package com.nagarro.lil.wisdompet.data.repositories;


import com.nagarro.lil.wisdompet.data.entities.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<ProductEntity, Long> {

}
