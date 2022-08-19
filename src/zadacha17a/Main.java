package zadacha17a;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
            Sheep sheep1=new Sheep(15,2,"female","kara");
            Sheep sheep2=new Sheep(16,3,"male","ak");
            Sheep sheep3=new Sheep(12,3,"male","sary");
            Sheep[]sheep={sheep1,sheep2,sheep3};

            Cow cow1=new Cow(80,3,"female","Zoya");
            Cow cow2=new Cow(120,2,"mail","Ferdinant");
            Cow cow3=new Cow(200,4,"male","Burui");
            Cow cow4=new Cow(150,3,"maile","ala");
            Cow cow5=new Cow(180,2,"maile","malysh");
            Cow[]cows={cow1,cow2,cow3,cow4,cow5};

            Horse horse1= new Horse(180,2,"maile","Kylyk");
            Horse horse2=new Horse(80,1,"femail","Jorgo");
            Horse[]horses={horse1,horse2};
            Farm farm1=new Farm("Belogorca","Ulan",cows,sheep,horses);

            Sheep sheep4=new Sheep(22,2,"female","bahash1");
            Sheep[]sheep2s={sheep4};

            Cow cow6=new Cow(123,3,"male","mu");
            Cow[]cows1={cow6};

            Horse horse3=new Horse(150,3,"female","ln");
            Horse[]horses1={horse3};
            Farm farm2=new Farm("Suusamyr","Asan",cows1,sheep2s,horses1);

        System.out.println("Fermer 1:  "+"Name:  "+farm1.getOwnerName()+"\n"+"Address:   "+farm1.getAddress());
        System.out.println("Horses:  "+farm1.getHorses().length);
        System.out.println("Cows:  "+farm1.getCows().length);
        System.out.println("Sheep:  "+farm1.getSheep().length);
           for (Sheep i:farm1.getSheep()){
               System.out.println(i.getNickName());
           }
        System.out.println("-------------------------");
        System.out.println("Fermer 2:  "+"Name:  "+farm2.getOwnerName()+"\n"+"Address:   "+farm2.getAddress());
        System.out.println("Horses:  "+farm2.getHorses().length);
        System.out.println("Cows:  "+farm2.getCows().length);
        for (Cow i:farm2.getCows()){
            System.out.println("Weight:  "+i.getWeight());
        }
        System.out.println("Sheep:  "+farm2.getSheep().length);

    }









}









