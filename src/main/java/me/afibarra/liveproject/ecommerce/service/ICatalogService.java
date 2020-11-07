package me.afibarra.liveproject.ecommerce.service;

import java.util.List;
import me.afibarra.liveproject.ecommerce.domain.Catalog;

public interface ICatalogService {

    List<Catalog> findAll();
}
