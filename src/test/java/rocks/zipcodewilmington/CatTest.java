package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        // Given
        Cat cat = new Cat(null, null, null);
        String givenName = "Foo";

        // When
        cat.setName(givenName);

        // Then
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }
    @Test
    public void speakTest() {
        // Given
        Cat myCat = new Cat(null, null, null);
        String expectedSpeak = "meow!";
        // When
        String actualSpeak = myCat.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);


    }
    @Test
    public void setBirthDateTest() {
        Cat myCat = new Cat(null, new Date(), null);
        Date expectedDate = new Date();

        // When
        myCat.setBirthDate(expectedDate);

        // Then
        Date actualDate = myCat.getBirthDate();
        Assert.assertEquals(actualDate, expectedDate);

    }
    @Test
    public void eatTest(){
        //Given
        Cat myCat = new Cat (null,null, null);
        Integer expectedEat = 1;
        //  when
        myCat.eat(new Food());
        Integer actualEat = myCat.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedEat, actualEat);

    }

    @Test
    public void getIdTest() {
        Cat myCat = new Cat (null,null, null);
        Integer expectedId = myCat.getId();

        Integer actualId = myCat.getId();

        Assert.assertEquals (actualId, expectedId);

    }

    @Test
    public void animalInheritanceTest() {
        Cat myCat = new Cat (null,null,null);
        Boolean actual = myCat instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals (actual, expected);


    }
    @Test
    public void mammalInheritanceTest() {
        Cat myCat = new Cat (null,null,null);
        Boolean actual = myCat instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals (actual, expected);

    }
}
