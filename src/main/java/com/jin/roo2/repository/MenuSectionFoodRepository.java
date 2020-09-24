package com.jin.roo2.repository;
import com.jin.roo2.domain.MenuSectionFood;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MenuSectionFoodRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MenuSectionFood.class)
public interface MenuSectionFoodRepository extends DetachableJpaRepository<MenuSectionFood, Long>, MenuSectionFoodRepositoryCustom {
}
