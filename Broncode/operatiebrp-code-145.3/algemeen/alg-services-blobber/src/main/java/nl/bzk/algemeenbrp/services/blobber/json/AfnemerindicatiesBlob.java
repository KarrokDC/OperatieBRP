/**
 * This file is copyright 2017 State of the Netherlands (Ministry of Interior Affairs and Kingdom Relations).
 * It is made available under the terms of the GNU Affero General Public License, version 3 as published by the Free Software Foundation.
 * The project of which this file is part, may be found at www.github.com/MinBZK/operatieBRP.
 */

package nl.bzk.algemeenbrp.services.blobber.json;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

/**
 * Representatie van de afnemerindicaties JSON BLOB.
 */
@JsonAutoDetect
@JsonInclude(JsonInclude.Include.NON_NULL)
public final class AfnemerindicatiesBlob {

    /**
     * Lijst met BlobRecords.
     */
    private List<BlobRoot> afnemerindicaties;

    /**
     * @return de afnemerindicaties
     */
    public List<BlobRoot> getAfnemerindicaties() {
        return afnemerindicaties;
    }

    /**
     * @param afnemerindicaties de afnemerindicaties
     */
    public void setAfnemerindicaties(final List<BlobRoot> afnemerindicaties) {
        this.afnemerindicaties = afnemerindicaties;
    }
}
