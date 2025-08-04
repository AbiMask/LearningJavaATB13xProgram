
package ex_28_ENUM;

public enum Colors {
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String color_code;

    Colors(String color_code){
        this.color_code = color_code;
    }

    public String getColor_code() {
        return this.color_code;
    }
}
