package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addDogTest() {
        DogHouse.add(new Dog (null, new Date(), 1));
        Integer expectedDogs = 2;
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals (expectedDogs, actualDogs);
    }

    @Test
    public void removeByIdTest() {
        Integer givenId = 2;
        Dog myDog = new Dog (null, new Date(), givenId);
        DogHouse.add(myDog);
        DogHouse.remove(givenId);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }

    @Test
    public void removeByNameTest() {
        Integer givenId = 2;
        Dog myDog = new Dog ("Buddy", new Date(), 2);
        DogHouse.add(myDog);
        DogHouse.remove(myDog);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }

    @Test
    public void getDogByIdTest() {
        Integer givenId= 1;
        DogHouse.clear();
        Dog expectedDog = new Dog ("", new Date(), givenId);
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(givenId);
        Assert.assertEquals(expectedDog, actualDog);

    }

    @Test
    public void getNumberOfDogsTest() {
        Integer expectedDogs = 0;
        Integer givenId = 2;
        DogHouse.clear();
        DogHouse.add(new Dog ("Milo", new Date(), 2));
        DogHouse.remove(givenId);
        Integer actualDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogs, actualDogs);
    }
}
