/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.bevraging.geefmedebewoners;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import nl.bzk.algemeenbrp.dal.domein.brp.enums.Element;

/**
 * Annotatie voor de conversie van specifieke velden naar BRP elementen.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ZoekCriteriaElement {

    /**
     * De elementnaam.
     */
    Element element();

    /**
     * Het {@link ZoekCriteriaType}.
     */
    ZoekCriteriaType type();
}
