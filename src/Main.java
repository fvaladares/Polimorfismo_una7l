/**
 * Origem: https://www.guj.com.br/t/exemplos-praticos-de-polimorfismo/65598/2 O
 */

public class Main {

    public void fazerAnimalComer( Animal animal ) {
        animal.comer();
    }

    public static void main(String[] args) {
        Main t = new Main();
        t.fazerAnimalComer( new Animal() );
        t.fazerAnimalComer( new Cao() );
        t.fazerAnimalComer( new Tigre() );

        Tigre animal = new Tigre();

        animal.comer("Salada");
    }
}
