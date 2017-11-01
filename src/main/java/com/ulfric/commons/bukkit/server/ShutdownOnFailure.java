package com.ulfric.commons.bukkit.server;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.ulfric.dragoon.extension.intercept.exceptionally.Exceptionally;

@Retention(RUNTIME)
@Target({ METHOD, ANNOTATION_TYPE, TYPE })
@Exceptionally(ShutdownOnFailureHandler.class)
public @interface ShutdownOnFailure {

}
