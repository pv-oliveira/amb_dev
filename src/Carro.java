public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean motorLigado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
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

    public void acelerar(int velocidade) {
        if (motorLigado) {
            System.out.println("Acelerando o motor...");
            for (int i = 0; i <= velocidade; i += 10) {
                System.out.println("Velocidade atual: " + i + " km/h");
                try {
                    Thread.sleep(1000); // Aguarda 1 segundo
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("O motor está a " + velocidade + " km/h.");
        } else {
            System.out.println("Não é possível acelerar. O motor está desligado.");
        }
    }
}