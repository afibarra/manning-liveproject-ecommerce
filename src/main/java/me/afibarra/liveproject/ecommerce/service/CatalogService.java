package me.afibarra.liveproject.ecommerce.service;

import java.util.List;
import me.afibarra.liveproject.ecommerce.domain.Catalog;
import org.springframework.stereotype.Service;

@Service
public class CatalogService implements ICatalogService {

    @Override
    public List<Catalog> findAll() {
        return null;
    }
}
