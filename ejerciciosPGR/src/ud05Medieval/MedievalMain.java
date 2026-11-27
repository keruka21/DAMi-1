package ud05Medieval;

public class MedievalMain{
    public static void main(String[] args) {
        Campesino campesino = new Campesino("Tomás", 2, 60, "Azada", 4);
        Mago mago = new Mago("Merlín", 8, 75, 10, ataque);
        Soldado soldado = new Soldado("Arturo", 6, 110, "Espada larga", 8);

        campesino.presentarse();
        campesino.play();
        campesino.venderCosecha();
        campesino.recibirDanio(20);

        System.out.println();

        mago.presentarse();
        mago.play();
        mago.play();
        mago.meditar(3);
        mago.recibirDanio(20);

        System.out.println();

        soldado.presentarse();
        soldado.play();
        soldado.recibirDanio(20);
    }
}



