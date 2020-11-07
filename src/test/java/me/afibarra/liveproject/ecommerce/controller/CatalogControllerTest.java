package me.afibarra.liveproject.ecommerce.controller;

import me.afibarra.liveproject.ecommerce.repository.ICatalogRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@ActiveProfiles("test")
@AutoConfigureMockMvc
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CatalogControllerTest {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ICatalogRepository catalogRepository;

    @Test
    public void catalogTest() throws Exception {
        int catalogSize = catalogRepository.findAll().size();

        this.mvc.perform(get("/catalog"))
                .andExpect(status().isOk())
                .andExpect(view().name("welcome"))
                .andExpect(model().attributeExists("catalog"))
                .andExpect(model().attribute("catalog", hasSize(catalogSize)));
    }
}
