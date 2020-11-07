package me.afibarra.liveproject.ecommerce.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
public class Catalog {

    @Id
    private String id;
    private String name;
    private Float price;
}
