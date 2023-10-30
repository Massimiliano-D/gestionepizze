package massimiliano.gestionepizze.config;


import massimiliano.gestionepizze.entities.Pizza;
import massimiliano.gestionepizze.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration{
    @Bean
    Topping getPeperoncino(){
        return  new Topping ("peperoncino", 0.40,3 );
    }
    @Bean
    Topping getPanna(){
        return  new Topping ("panna", 0.60,6 );
    };
    @Bean
    Topping getVentricina(){
        return  new Topping ("ventricina", 0.80,8 );
    };
    @Bean
    Topping getAnanas(){
        return  new Topping ("ananas", 2.00,4 );
    };
    @Bean
    Pizza getMarghe(){
        return new  Pizza ("margherita",4.99,1104,new ArrayList<Topping>());
    }
    @Bean
    Pizza getDiavola(){
        List<Topping>ingr= new ArrayList<Topping>();
        ingr.add(getPeperoncino());
        ingr.add(getVentricina());
    };
    @Bean
    Pizza getAmericana(){
        List<Topping>ingr= new ArrayList<Topping>();
        ingr.add(getAnanas());
        ingr.add(getPanna());
    }
}
