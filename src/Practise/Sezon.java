package Practise;

public enum Sezon {
    SPRING("Yaz", 10, 20, "Təbiət oyanır və çiçəklər açır"),
    SUMMER("Yay", 25, 40, "İsti hava və dəniz mövsümü"),
    AUTUMN("Payız", 5, 15, "Yarpaqlar saralır və hava soyuyur"),
    WINTER("Qış", -10, 5, "Soyuq hava və qar yağışı");

    private final String action;
    private final int min;
    private final  int max;
    private final String haqiinda;

    Sezon(String action, int min, int max, String haqiinda) {
        this.action = action;
        this.min = min;
        this.max = max;
        this.haqiinda = haqiinda;
    }

    public String getAction() {
        return action;

    }

    public  String getInfo(){
        return String.format(
                "%s: : %d°C, Maksimal temperatur: %d°C. Təs: %s",
                this.name(), min, max, haqiinda
        );
    }


}
