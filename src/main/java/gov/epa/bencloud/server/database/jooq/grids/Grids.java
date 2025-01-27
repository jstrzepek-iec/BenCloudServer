/*
 * This file is generated by jOOQ.
 */
package gov.epa.bencloud.server.database.jooq.grids;


import gov.epa.bencloud.server.database.jooq.DefaultCatalog;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCmaq_12kmNation;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCmaq_12kmNationClipped;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsCounty;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsNation;
import gov.epa.bencloud.server.database.jooq.grids.tables.UsState;

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Grids extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>grids</code>
     */
    public static final Grids GRIDS = new Grids();

    /**
     * The table <code>grids.us_cmaq_12km_nation</code>.
     */
    public final UsCmaq_12kmNation US_CMAQ_12KM_NATION = UsCmaq_12kmNation.US_CMAQ_12KM_NATION;

    /**
     * The table <code>grids.us_cmaq_12km_nation_clipped</code>.
     */
    public final UsCmaq_12kmNationClipped US_CMAQ_12KM_NATION_CLIPPED = UsCmaq_12kmNationClipped.US_CMAQ_12KM_NATION_CLIPPED;

    /**
     * The table <code>grids.us_county</code>.
     */
    public final UsCounty US_COUNTY = UsCounty.US_COUNTY;

    /**
     * The table <code>grids.us_nation</code>.
     */
    public final UsNation US_NATION = UsNation.US_NATION;

    /**
     * The table <code>grids.us_state</code>.
     */
    public final UsState US_STATE = UsState.US_STATE;

    /**
     * No further instances allowed
     */
    private Grids() {
        super("grids", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            UsCmaq_12kmNation.US_CMAQ_12KM_NATION,
            UsCmaq_12kmNationClipped.US_CMAQ_12KM_NATION_CLIPPED,
            UsCounty.US_COUNTY,
            UsNation.US_NATION,
            UsState.US_STATE
        );
    }
}
