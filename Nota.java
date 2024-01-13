package projeto;

public class Nota {

    private double nota1;
    private double nota2;
    private double notafinal;
    private boolean aprovado;

    public Nota() {
        this.nota1 = 0;
        this.nota2 = 0;
        this.notafinal = 0;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNotafinal(double notafinal) {
        this.notafinal = notafinal;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public double getNotafinal() {
        return this.notafinal;
    }

    public double Media() {
        return (this.nota1 + this.nota2) / 2;
    }

    public double calcularMediaFinal() {
        if (this.notafinal > 0) {
            double mediaFinal = (this.nota1 + this.nota2 + this.notafinal) / 3;
            return mediaFinal;
        } else {
            double mediaFinal = this.Media();
            this.aprovado = mediaFinal >= 60;
            return mediaFinal;
        }
    }

    public void reprovar() {
    }
}