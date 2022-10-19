package com.sptech.projeto.lista.desafio;

import java.util.ArrayList;
import java.util.List;

public class ListaUtil {

    private List<Integer> inteiros;

    public ListaUtil() {
        inteiros = new ArrayList();
    }

    public void add(Integer valor) {
        if (valor != null) {
            inteiros.add(valor);
        }
    }

    public void remove(Integer valor) {
        inteiros.remove(valor);
    }

    public Integer count() {
        return inteiros.size();
    }

    public Integer countPares() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public Integer countImpares() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (inteiros.get(i) % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public Integer somar() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            contador += inteiros.get(i);

        }
        return contador;
    }

    public Integer getMaior() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (contador < inteiros.get(i)) {
                contador = inteiros.get(i);
            }

        }
        return contador;
    }

    public Integer getMenor() {
        Integer contador = 0;
        for (int i = 0; i < inteiros.size(); i++) {
            if (contador > inteiros.get(i)) {
                contador = inteiros.get(i);
            }

        }
        return contador;
    }

    public Boolean hasDuplicidade() {
        Integer duplicidade = 0;

        for (int i = 0; i < inteiros.size(); i++) {
            duplicidade = 0;
            for (int j = 0; j < inteiros.size(); j++) {
                if (inteiros.get(i) == inteiros.get(j)) {
                    duplicidade++;
                }
                if (duplicidade > 1) {
                    return true;
                }
            }

        }
        return false;
    }
}
