package exercicios;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RetanguloTeste {

    @Test
    public void criarObjetoRetangulo(){
        Retangulo r1 = new Retangulo();
        assertNotNull(r1);
    }
    @Test

    public void presencaAtributos(){
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        assertNotNull(r1.base);
        assertNotNull(r1.altura);
    }

    @Test

    public void metodoCalcularArea(){

        //Arrange
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 200.0;

       //Act
        Double valorObtido = r1.caucularArea();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }

    @Test

    public void metodoCalcularPerimetro(){

        //Arrange
        Retangulo r1 = new Retangulo();
        r1.base = 10.0;
        r1.altura = 20.0;
        Double valorEsperado = 60.0;

        //Act
        Double valorObtido = r1.caucularPerimetro();

        //Assert
        assertEquals(valorEsperado, valorObtido);
    }
}
