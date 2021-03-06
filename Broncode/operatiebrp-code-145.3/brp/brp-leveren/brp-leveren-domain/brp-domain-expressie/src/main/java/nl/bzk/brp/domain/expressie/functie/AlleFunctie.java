/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.domain.expressie.functie;

import java.util.List;
import nl.bzk.brp.domain.expressie.Context;
import nl.bzk.brp.domain.expressie.Expressie;
import nl.bzk.brp.domain.expressie.ExpressieType;
import nl.bzk.brp.domain.expressie.signatuur.ExistentieleFunctieSignatuur;
import org.springframework.stereotype.Component;

/**
 * Representeert de functie ALLE(L,V,C). De functie geeft true terug als alle elementen uit lijst L voldoen aan
 * conditie C, waarbij variabele V steeds de waarde van een element uit L aanneemt.
 */
@Component
@FunctieKeyword("ALLE")
final class AlleFunctie extends AbstractFunctie {

    /**
     * Constructor voor de functie.
     */
    AlleFunctie() {
        super(new ExistentieleFunctieSignatuur());
    }

    @Override
    public Expressie evalueer(final List<Expressie> argumenten, final Context context) {
        return evalueerLijst(argumenten, context, true);
    }

    @Override
    public boolean evalueerArgumenten() {
        return false;
    }

    @Override
    public ExpressieType getType(final List<Expressie> argumenten, final Context context) {
        return ExpressieType.BOOLEAN;
    }
}
