import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    private Animal animalName = new Animal("Wolf");
    private Animal animalName2 = animalName;
    private Animal animalName3 = new Animal("Wolf");
    private Animal animalName4 = new Animal("Dog");

    String message = "This is a time out message";


    @Test
    public void getAnimalName() {//object equality

        assertEquals(animalName2.getAnimalName(), animalName.getAnimalName());


    }

    @Test
    public void testGetName() {//Object Identity


       if(animalName == animalName){
           //true
       }
       if (animalName == animalName2){
           //true
       }

       if (animalName == animalName3){
           //false
       }


    }


    @Test
    public void testGetAnimalName() {//fail test

        assertEquals(animalName.getAnimalName(), animalName4.getAnimalName());

    }


    @Test(timeout = 10)
    public void timeOutTest(){
        Animal animalMessage = new Animal();
        animalMessage.setMessage(message);

        System.out.println("Inside timeOutTest()");
        animalMessage.getMessage();

    }
    @Ignore("not ready yet")
    @Test
    public void testMethod(){

        System.out.println("This method is not ready");
    }


}