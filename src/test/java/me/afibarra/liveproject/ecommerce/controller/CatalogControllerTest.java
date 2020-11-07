package me.afibarra.liveproject.ecommerce.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlPlainText;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CatalogControllerTest {

    private WebClient webClient;

    @BeforeEach
    public void init() throws Exception {
        webClient = new WebClient();
    }

    @AfterEach
    public void close() throws Exception {
        webClient.close();
    }

    @Test
    public void success_whenRetrievingCatalog() throws Exception {
        String URL = "http://127.0.0.1:8080/catalog";
        String XPATH_CARD_BODY = "//div[@class='card-body']";

        final HtmlPage htmlPage = webClient.getPage(URL);
        List<HtmlDivision> cards = htmlPage.getByXPath(XPATH_CARD_BODY);

        assertThat(cards).isNotNull();
        assertThat(cards).isNotEmpty();
    }
}
