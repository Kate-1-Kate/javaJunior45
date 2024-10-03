package lesson2;

public class HomeWork2_2 {

    public static void main(String[] args) {

        int personAge = 32;


        if(personAge < 18){
            System.out.println("Ребёнок");
        } else if (personAge <= 40) {
            System.out.println("Молодой");
        } else if (personAge <= 60) {
            System.out.println("Взрослый");
        } else if (personAge <= 75){
            System.out.println("Пожилой");
        } else if (personAge <= 90 ) {
            System.out.println("Старик");
        } else if (personAge > 90) {
            System.out.println("Долгожитель");
        }


    }





}
