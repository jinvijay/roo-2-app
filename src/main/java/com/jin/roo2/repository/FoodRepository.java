package com.jin.roo2.repository;
import com.jin.roo2.domain.Food;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = FoodRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Food.class)
public interface FoodRepository extends DetachableJpaRepository<Food, Long>, FoodRepositoryCustom {
}
