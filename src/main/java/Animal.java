public class Animal {

    private String animalName;
    private String message;



    public Animal(String aniName){

        animalName = aniName;

    }

    public Animal(){}

    public String getAnimalName() {
        return animalName;
    }

    public void setMessage(String msg){

      message = msg;
    }

    public String getMessage(){

        return message;
    }
}
