package massimiliano.gestionepizze.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Pizza {
    String name;
    double prezzo;
    int calorie;
    private final  String base1= "pomodoro";
    private final  String base2= "mozzarella";
    private List<Topping> topping = new ArrayList<>();
}
