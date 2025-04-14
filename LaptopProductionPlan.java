package org.example;
import java.util.HashMap;
import java.util.Map;

public class LaptopProductionPlan {
    private static int laptopQuantity = 1;

    // Per-laptop material requirement
    private static final Map<String, Integer> perLaptopMaterials = new HashMap<>();

    static {
        perLaptopMaterials.put("Aluminum", 5);
        perLaptopMaterials.put("Motherboard", 1);
        perLaptopMaterials.put("Screen", 1);
        perLaptopMaterials.put("RAM", 1);
        perLaptopMaterials.put("Keyboard", 1);
        perLaptopMaterials.put("Switch", 1);
        perLaptopMaterials.put("Camera", 1);
        perLaptopMaterials.put("Box", 1);
    }

    public static void setLaptopQuantity(int quantity) {
        laptopQuantity = quantity;
    }

    public static int getLaptopQuantity() {
        return laptopQuantity;
    }

    // Get total required quantity for a material
    public static int getQuantityFor(String materialName) {
        Integer perUnit = perLaptopMaterials.get(materialName);
        return (perUnit != null) ? perUnit * laptopQuantity : 0;
    }
}
