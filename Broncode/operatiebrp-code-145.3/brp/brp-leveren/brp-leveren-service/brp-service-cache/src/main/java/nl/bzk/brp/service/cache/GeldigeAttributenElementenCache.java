/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.brp.service.cache;

import nl.bzk.brp.domain.element.AttribuutElement;

/**
 * GeldigeElementenCache.
 */
public interface GeldigeAttributenElementenCache {

    /**
     * @return cachentry.
     */
    CacheEntry herlaad();

    /**
     * @param attribuutElement attribuutElement
     * @return geldig
     */
    boolean geldigVoorAttribuutAutorisatie(AttribuutElement attribuutElement);

    /**
     * @param attribuutElement attribuutElement
     * @return geldig
     */
    boolean geldigVoorGroepAutorisatie(AttribuutElement attribuutElement);
}
