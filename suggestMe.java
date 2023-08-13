import java.util.Scanner;

public class suggestMe{

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int weatherDegree;
        System.out.println("How many degrees is it where you are?");
        weatherDegree=input.nextInt();

        if(weatherDegree<5){
            System.out.println("Nothing like skiing in this weather");
        } 
        else if(weatherDegree>5 && weatherDegree<=25){
            if(weatherDegree>=5 && weatherDegree<=10){
                System.out.println("How about warming up with some action scenes in this weather");
            }else if(weatherDegree>10 && weatherDegree<=15){
                System.out.println("How about warming up with some action scenes in this weather or to have a picnic :) ");
            } else if(weatherDegree>15 && weatherDegree<=25){
                System.out.println("How about to have a picnic");
            }
        }
        else if(weatherDegree>25){
            System.out.println("There is nothing like in this hot weather, dont't think, just dive in !");
        }    

        



    }
}