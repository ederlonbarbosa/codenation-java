package challenge;

public class CriptografiaCesariana implements Criptografia {

    /**
     * Criptografa um texto recebido por parâmetro
     *
     * @param texto
     * @return
     */
    @Override
    public String criptografar(final String texto) {
        return processarTexto(texto, new Criptografador());
    }

    /**
     * Descriptografa um texto recebido por parâmetro
     *
     * @param texto
     * @return
     */
    @Override
    public String descriptografar(final String texto) {
        return processarTexto(texto, new Descriptografador());
    }

    private String processarTexto(String texto, final Processador processador) {
        validarTextoVazio(texto);
        validarTextoNulo(texto);

        texto = texto.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < texto.length(); i++) {
            stringBuilder.append(processador.getLetraProcessada(texto.charAt(i)));
        }
        return stringBuilder.toString();
    }

    private void validarTextoVazio(final String texto) {
        if ("".equals(texto)) {
            throw new IllegalArgumentException("O texto não pode ser vazio");
        }
    }

    private void validarTextoNulo(final String texto) {
        if (texto == null) {
            throw new NullPointerException("O texto não pode ser nulo");
        }
    }
}
