public class Tigre extends Animal {
    public void comer() {
        System.out.println( "Tigre Comendo..." );
    }

    public void comer(String alimento) {
        System.out.println("Animal Comendo " + alimento);
    }
}