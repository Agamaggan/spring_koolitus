package ee.joosep.javaspring;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private Long id;
    private String name;
    private double price;
    private String imgScr;
    private boolean active;
    private String description;
    private String category;
}
