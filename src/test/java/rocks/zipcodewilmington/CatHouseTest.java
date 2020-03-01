package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAdd(){
        Integer expectedCats = 1;
        CatHouse.add(new Cat("Foo", new Date(), 1));
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals (expectedCats, actualCats);
    }

    @Test
    public void testRemove1(){
        Integer givenId = 2;
        Cat myCat = new Cat (null, new Date(), givenId);
        CatHouse.add(myCat);
        CatHouse.remove(givenId);
        Assert.assertNull(CatHouse.getCatById(givenId));

    }
    @Test
    public void testRemove2(){
        Integer givenId = 2;
        Cat myCat = new Cat ("Foo", new Date(), 2);
        CatHouse.add(myCat);
        CatHouse.remove(myCat);
        Assert.assertNull(CatHouse.getCatById(givenId));

    }

    @Test
    public void testGetCatById(){
        Integer givenId= 1;
        CatHouse.clear();
        Cat expectedCat = new Cat ("Foo", new Date(), givenId);
        CatHouse.add(expectedCat);
        Cat actualCat = CatHouse.getCatById(givenId);
        Assert.assertEquals(expectedCat, actualCat);

    }

    @Test
    public void testGetNumberOfCats(){
        Integer expectedCats = 0;
        Integer givenId = 2;
        CatHouse.clear();
        CatHouse.add(new Cat ("Foo", new Date(), 2));
        CatHouse.remove(givenId);
        Integer actualCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats, actualCats);

    }
}
