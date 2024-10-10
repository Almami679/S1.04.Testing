package Nivell2.Ex1;

import java.util.Objects;

public class Ex1 {

    int valor;

    public Ex1(int valor){
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ex1 ex1 = (Ex1) o;
        return valor == ex1.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }
}
