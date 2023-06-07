public class Pneu {
    private String marca;
    private int tamanho;
    private int pressao;

    public Pneu(String marca, int tamanho) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.pressao = 30; // Pressão inicial padrão
    }

    public String getMarca() {
        return marca;
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getPressao() {
        return pressao;
    }

    public void trocarPneu(Carro carro) {
        if (carro.getVelocidade() > 0) {
            System.out.println("O carro está em movimento, pare o carro para trocar o pneu!");
        } else {
            System.out.println("O pneu foi trocado.");
        }
    }

    public void encherPneu(int pressao) {
        if (pressao > 0 && pressao <= 40) {
            System.out.println("Enchendo o pneu...");
            this.pressao = pressao;
            System.out.println("O pneu foi inflado para " + pressao + " psi.");
        } else {
            System.out.println("Pressão inválida. A pressão do pneu deve ser entre 1 e 40 psi.");
        }
    }

    public void esvaziarPneu() {
        System.out.println("Esvaziando o pneu...");
        this.pressao = 0;
        System.out.println("O pneu foi esvaziado.");
    }
}
