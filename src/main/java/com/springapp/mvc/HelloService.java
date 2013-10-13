package com.springapp.mvc;

import com.ag.spring_extensions.properties.ReloadableProperty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: johnlees
 * Date: 10/12/13
 * Time: 10:06 PM
 * To change this template use File | Settings | File Templates.
 */
@Component("helloService")
public class HelloService {

    @Value("${property.using.value.annotation.from.security}")
    private String propertyUsingValueAnnotationFromSecurity;

    @Value("${property.using.value.annotation.from.override}")
    private String propertyUsingValueAnnotationFromOverride;

    @ReloadableProperty("property.using.reloadable.annotation.from.security")
    private String propertyUsingReloadablePropertyAnnotationFromSecurity;

    @ReloadableProperty("property.using.reloadable.annotation.from.override")
    private boolean propertyUsingReloadablePropertyAnnotationFromOverride;


    public String getPropertyUsingValueAnnotationFromSecurity() {
        return propertyUsingValueAnnotationFromSecurity;
    }

    public String getPropertyUsingValueAnnotationFromOverride() {
        return propertyUsingValueAnnotationFromOverride;
    }

    public String getPropertyUsingReloadablePropertyAnnotationFromSecurity() {
        return propertyUsingReloadablePropertyAnnotationFromSecurity;
    }

    public boolean getPropertyUsingReloadablePropertyAnnotationFromOverride() {
        return propertyUsingReloadablePropertyAnnotationFromOverride;
    }
}
