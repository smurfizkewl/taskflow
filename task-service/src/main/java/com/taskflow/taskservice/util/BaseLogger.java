package com.taskflow.taskservice.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseLogger {

    protected final Logger log = LoggerFactory.getLogger(getClass());
}
