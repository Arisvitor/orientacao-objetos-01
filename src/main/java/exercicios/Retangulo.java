package exercicios;

public class Retangulo {
    public Double base;
    public Double altura;

    public Double caucularArea(){
        return base * altura;
    }

    public Double caucularPerimetro(){
        return 2* (base + altura);
    }
}
