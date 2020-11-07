package me.afibarra.liveproject.ecommerce.repository;

import me.afibarra.liveproject.ecommerce.domain.Catalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICatalogRepository extends JpaRepository<Catalog, String> {
}
