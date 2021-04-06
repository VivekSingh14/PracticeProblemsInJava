package DesignPatterns.Creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class ColorStore {
    private static Map<String, Color> colorMap = new HashMap<>();
    
    static{
        colorMap.put("Blue", new BlueColor());
        colorMap.put("Black", new BlackColor());
        colorMap.put("blue", new BlueColor());
        colorMap.put("black", new BlackColor());
    }

    public static Color getColor(String colorName){
        return (Color)colorMap.get(colorName).clone();
    }
}
