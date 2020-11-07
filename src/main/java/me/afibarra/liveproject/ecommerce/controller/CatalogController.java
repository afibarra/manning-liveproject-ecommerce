package me.afibarra.liveproject.ecommerce.controller;

import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import me.afibarra.liveproject.ecommerce.domain.Catalog;
import me.afibarra.liveproject.ecommerce.repository.ICatalogRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/")
public class CatalogController {

    private final ICatalogRepository catalogRepository;

    public CatalogController(ICatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    @GetMapping
    public String getWelcome(Model model) {
        return "welcome";
    }

    @GetMapping("/catalog")
    public ModelAndView getAllCakes(Map<String, Object> model) {
        List<Catalog> catalog = catalogRepository.findAll();
        model.put("catalog", catalog);

        return new ModelAndView("welcome", model);
    }
}
