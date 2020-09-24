package com.jin.roo2.repository;
import com.jin.roo2.domain.MenuSection;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MenuSectionRepository
 *
 * TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MenuSection.class)
public interface MenuSectionRepository extends DetachableJpaRepository<MenuSection, Long>, MenuSectionRepositoryCustom {
}
