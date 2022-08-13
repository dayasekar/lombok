package com.daya.lombok.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Legacy {

    private static final Logger LOG = LoggerFactory.getLogger(Legacy.class);

    public void run() {
        LOG.info("Log statement from legacy");
    }
 }
