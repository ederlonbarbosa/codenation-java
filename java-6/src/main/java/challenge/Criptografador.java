package challenge;

import challenge.helper.AlfabetoHelper;

public class Criptografador implements Processador {

    private AlfabetoHelper alfabetoHelper;

    public Criptografador() {
        this.alfabetoHelper = new AlfabetoHelper();
    }

    @Override
    public Character getLetraProcessada(final char letra) {
        return alfabetoHelper.getLetraCriptografada(letra);
    }
}
