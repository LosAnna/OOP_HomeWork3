import java.util.HashMap;
import java.util.Map;

public final class Cat {
    private final String name;
    private final String breed;
    private final Map<String, String> myMap;

    public Cat(String name, String breed, Map<String, String> myMap) {
        this.name = name;
        this.breed = breed;
        Map<String, String> deepCopy = new HashMap<>();
        for(String key: myMap.keySet()) {
            deepCopy.put(key, myMap.get(key));
        }
        this.myMap = myMap;
    }
    public String getName() {
        return String.copyValueOf(name.toCharArray());
    }
    public String getBreed() {
        return String.copyValueOf(breed.toCharArray());
    }

    public Map<String, String> getMyMap() {
        Map<String, String> deepCopy = new HashMap<>();
        for(String key: myMap.keySet()) {
            deepCopy.put(key, myMap.get(key));
        }
        return deepCopy;
    }
}
