package comsda.service;

import org.apache.commons.lang3.StringUtils;

public class WriterService {
    public String write(String name){
        return prefix(name)+ contetnt(name)+ suffix(name);
    }

    private String prefix(String name) {
        return isCapitalaizedName(name) ? "HELLO, " : "Hello, ";
    }

    private String contetnt(String name) {
        return StringUtils.isEmpty(name) ? "my friend" : name;
    }

    private String suffix(String name) {
        return isCapitalaizedName(name) ? "!" : ".";
    }

    private boolean isCapitalaizedName(String name){
        return StringUtils.isNotEmpty(name) && name.toUpperCase().equals(name);
    }

}
