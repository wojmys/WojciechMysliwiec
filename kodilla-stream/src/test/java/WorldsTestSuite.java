import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.*;
import java.util.*;

public class WorldsTestSuite {

    @Test
    void test() {

        World world = new World();

        final Set<Continent> continents = new HashSet<>();

        Continent europe = new Continent("Europe");

        Country austria = new Country("Austria", new BigDecimal("5000000"));
        Country norway = new Country("Norway", new BigDecimal("3000000"));
        Country belarus = new Country("Belarus", new BigDecimal("2000000"));

     europe.addCountry(austria);
     europe.addCountry(belarus);
     europe.addCountry(norway);



        Continent asia = new Continent("Asia");

        Country china = new Country("China", new BigDecimal("1000000000"));
        Country russia = new Country("Russia", new BigDecimal("150000000"));
        Country japan = new Country("Japan", new BigDecimal("3500000"));

        asia.addCountry(china);
        asia.addCountry(russia);
        asia.addCountry(japan);

        Continent australia = new Continent("Australia");

        Country australiaCountry = new Country("Australia", new BigDecimal("5000000"));

        australia.addCountry(australiaCountry);

        //when
        continents.add(europe);
        continents.add(asia);
        continents.add(australia);

        BigDecimal actual = world.getPeopleQuantity(continents);




        Assertions.assertEquals(new  BigDecimal("1168500000"),actual);

    }

}
