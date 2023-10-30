package massimiliano.gestionepizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Topping {
    String name;
    double prezzo;
    int calorie;


}
