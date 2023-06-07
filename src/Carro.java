public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;
    private boolean motorLigado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
        this.motorLigado = false;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String isMotorLigado() {
        if (motorLigado) {
            return "O motor está ligado.";
        } else {
            return "O motor está desligado.";
        }
    }

    public void ligarMotor() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("O motor foi ligado.");
        } else {
            System.out.println("O motor já está ligado.");
        }
    }

    public void desligarMotor() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("O motor foi desligado.");
        } else {
            System.out.println("O motor já está desligado.");
        }
    }

    public void acelerar(int novaVelocidade) {
        velocidade = novaVelocidade;
        if (motorLigado) {
            System.out.println("Acelerando o motor...");
            for (int i = 0; i <= novaVelocidade; i += 10) {
                System.out.println("Velocidade atual: " + i + " km/h");
                try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("O motor está a " + novaVelocidade + " km/h.");
        } else {
            System.out.println("Não é possível acelerar. O motor está desligado.");
        }
    }

    public void frear() {
        if (motorLigado) {
            System.out.println("Freando o motor...");
            for (int i = velocidade; i >= 0; i -= 5) {
                System.out.println("Velocidade atual: " + i + " km/h");
                try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("O motor está parado.");
            velocidade = 0;
        } else {
            System.out.println("Não é possível frear. O motor está desligado.");
        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void manutencao(Pneu pneu) {
        if(pneu.getPressao() < 29) {
            System.out.println("Os pneus precisam de manutenção, calibrando...");
            pneu.encherPneu(35);
        } else if(pneu.isNovoPneu()){
            System.out.println("Pressao está boa, e pneu está novo, manutenção feita...");
        } else {
            System.out.println("Pressao está boa, mas pneu está velho, recomendo trocar...");
        }
    }
}
