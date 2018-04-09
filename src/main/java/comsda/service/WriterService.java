package comsda.service;

public class WriterService {
    public String write(String name){
        return prefix(name)+ contetnt(name)+ suffix(name);
    }

    private String prefix(String name) {
        return isCapitalaizedName(name) ? "HELLO, " : "Hello, ";
    }

    private String contetnt(String name) {
        return name == null ? "my friend" : name;
    }

    private String suffix(String name) {
        return isCapitalaizedName(name) ? "!" : ".";
    }

    private boolean isCapitalaizedName(String name){
        return name != null && name.toUpperCase().equals(name);
    }

}
