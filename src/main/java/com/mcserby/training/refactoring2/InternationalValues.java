package com.mcserby.training.refactoring2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@PropertySource(value = "map.properties")
public class InternationalValues {

    public Map<String, Map<String,String>> getLocaleToInfo() {
        return localeToInfo;
    }

    @Value("#{${simple.map}}")
    private Map<String, Map<String,String>> localeToInfo;


}
