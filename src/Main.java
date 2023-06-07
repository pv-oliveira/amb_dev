// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022);
        Pneu pneu = new Pneu("Pirelli", 14);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        carro.ligarMotor();
        System.out.println(carro.isMotorLigado());

        carro.acelerar(10);

        carro.desligarMotor();
        System.out.println(carro.isMotorLigado());

        if(pneu.getPressao() > 29) {
            System.out.println("Pressao do pneu é de: " + pneu.getPressao() + ". A pressão está boa");
        } else {
            System.out.println("Precisa calibrar o pneu");
        }

        pneu.trocarPneu(carro);

        int n = carro.getVelocidade();
        System.out.println(n);
        pneu.getPressao();
    }
}