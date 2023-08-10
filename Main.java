package session;

public class Main {
    public static void main(String[] args) {
       Beast tiger = new Tiger("Tiger",84);
       Beast gepard = new Gepard("Gepard",96);
       Beast wolf = new Wolf("wolf",72);

       Beast [] beasts = {tiger,wolf,gepard};
        for (int i = 0; i < beasts.length; i++) {
            System.out.println(beasts[i].getName()+" "+beasts[i].getWeight()+" "+beasts[i].attack()+" "+beasts[i].speed());
        }
    }
}
