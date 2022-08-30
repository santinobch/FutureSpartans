package com.santinobch.futurespartans.utils;

import com.santinobch.futurespartans.FutureSpartans;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogHelper {
    private static final Logger LOG = LogManager.getLogger(FutureSpartans.NAME);

    public static void debug(Object object) { LOG.debug(object); }

    public static void error(Object object) { LOG.error(object); }

    public static void fatal(Object object) { LOG.fatal(object); }

    public static void info(Object object) { LOG.info(object); }

    public static void trace(Object object) { LOG.trace(object); }

    public static void warn(Object object) { LOG.warn(object); }
}
