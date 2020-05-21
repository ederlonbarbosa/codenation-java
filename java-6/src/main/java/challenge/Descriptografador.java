package challenge;

import challenge.helper.AlfabetoHelper;

public class Descriptografador implements Processador {

    private AlfabetoHelper alfabetoHelper;

    public Descriptografador() {
        this.alfabetoHelper = new AlfabetoHelper();
    }

    @Override
    public Character getLetraProcessada(final char letra) {
        return alfabetoHelper.getLetraDescriptografada(letra);
    }
}
