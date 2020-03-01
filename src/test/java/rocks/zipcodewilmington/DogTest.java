package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void speakTest() {
        // Given
        Dog myDog = new Dog(null, null, null);
        String expectedSpeak = "bark!";
        // When
        String actualSpeak = myDog.speak();
        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);


    }
    @Test
    public void setBirthDateTest() {
        // Given
        Dog myDog = new Dog(null, new Date(), null);
        Date expectedDate = new Date();

        // When
        myDog.setBirthDate(expectedDate);

        // Then
    Date actualDate = myDog.getBirthDate();
    Assert.assertEquals(actualDate, expectedDate);
    }

    @Test
    public void eatTest(){
        //Given
        Dog myDog = new Dog (null,null, null);
        Integer expectedEat = 1;
        //  when
        myDog.eat(new Food());
        Integer actualEat = myDog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedEat, actualEat);

    }

    @Test
    public void getIdTest() {
        Dog myDog = new Dog(null, null, 1);
        Integer expectedId = myDog.getId();

        Integer actualId = myDog.getId();

        Assert.assertEquals (actualId, expectedId);

    }
    @Test
    public void animalInheritanceTest() {
        Dog myDog = new Dog (null,null,null);
        Boolean actual = myDog instanceof Animal;
        Boolean expected = true;
        Assert.assertEquals (actual, expected);


}
    @Test
    public void mammalInheritanceTest() {
        Dog myDog = new Dog (null,null,null);
        Boolean actual = myDog instanceof Mammal;
        Boolean expected = true;
        Assert.assertEquals (actual, expected);

    }
}


