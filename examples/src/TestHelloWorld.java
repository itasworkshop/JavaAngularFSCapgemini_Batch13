
//OOPS --> consider everything as real world entities
//objects --> attribute/behaviour, properties/functionalities
//class --> template/blueprint for creating objects
//example -- enquiry form empty --> class

class Mobile{
    int price;
    String color;
    String company;

    public Mobile(int price, String color, String company) {
        this.price = price;
        this.color = color;
        this.company = company;
    }

    public int cubeArea(int side){
        return side*side;
    }

    public int volumeCube(int side){
        return cubeArea(side)*side;
    }


    public void callAnyOne(){
        System.out.println("calling someone ......");
    }

    public void playMusic(){
        System.out.println("playing Lata Ji's songs ......");
    }

    public void takePics(){
        System.out.println("taking selies ......");
    }
}


public class TestHelloWorld {

    public static void main(String[] args){
        Mobile obj1 = new Mobile(20000,"Black","Samsung");
        Mobile obj2 = new Mobile(25000,"white","Apple");

        //obj1.price = 50000;
        //obj1.company = "Apple";

        obj1.playMusic();

        //obj2.price = 50000;
        //obj2.company = "Apple";

        obj2.playMusic();

        System.out.println(obj2.volumeCube(5));
    }

}
