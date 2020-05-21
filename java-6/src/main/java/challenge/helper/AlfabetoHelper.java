package challenge.helper;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlfabetoHelper {

    private static Map<Character, Character> alfabetoCriptografadoMap = new HashMap<>();
    private static Map<Character, Character> alfabetoDescriptografadoMap = new HashMap<>();
    private static char[] alfabeto = inicilizarAlfabeto();

    private static char[] inicilizarAlfabeto() {
        // não existe a necessidade de instânciar e reiniciliar o alfabeto e mapas, visto que eles não irão mudar.
        if (alfabeto == null) {
            alfabeto = criarAlfabetoDeAaZ();
            inicializarMaps();
        }
        return alfabeto;
    }

    private static char[] criarAlfabetoDeAaZ() {
        return IntStream.rangeClosed('a', 'z')
                .mapToObj(c -> "" + (char) c)
                .collect(Collectors.joining())
                .toCharArray();
    }

    /**
     * Retorna a letra criptografada
     *
     * @param letra
     * @return
     */
    public Character getLetraCriptografada(final char letra) {
        return alfabetoCriptografadoMap.get(letra) == null ? letra : alfabetoCriptografadoMap.get(letra);
    }

    /**
     * Retorna a letra descriptografada
     *
     * @param letra
     * @return
     */
    public Character getLetraDescriptografada(final char letra) {
        return alfabetoDescriptografadoMap.get(letra) == null ? letra : alfabetoDescriptografadoMap.get(letra);
    }

    private static void inicializarMaps() {

        final int deslocamento = 3;
        for (int i = 0; i < alfabeto.length - deslocamento; i++) {
            final char letra = alfabeto[i];
            final char letraDeslocada = alfabeto[i + deslocamento];

            alfabetoCriptografadoMap.put(letra, letraDeslocada);
            alfabetoDescriptografadoMap.put(letraDeslocada, letra);
        }

        //complementa as letras faltantes no alfabeto criptografado
        for (int i = 23, j = 0; i < alfabeto.length; i++, j++) {
            alfabetoCriptografadoMap.put(alfabeto[i], alfabeto[j]);
        }

        //complementa as letras faltantes no alfabeto descriptografado
        for (int i = 0, j = deslocamento; i < deslocamento; i++, j++) {
            alfabetoDescriptografadoMap.put(alfabeto[i], alfabeto[j]);
        }
    }
}