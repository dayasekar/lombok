package com.daya.lombok.nonnull;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Legacy {

    private static final Logger LOG = LoggerFactory.getLogger(Legacy.class);

    public void run(@NonNull String toPrint) {
        LOG.info("Printing {}", toPrint);
    }
}
