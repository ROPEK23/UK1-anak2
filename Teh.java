// File: Teh.java
public class Teh extends Minuman {
    private String suhu;

    // Constructor
    public Teh(String nama, String rasa, String suhu) {
        super(nama, rasa);  // Memanggil constructor induk
        this.suhu = suhu;
    }

    // Overriding constructor
    public Teh() {
        this("Teh", "Tawar", "Hangat");
    }

    // Getter dan Setter untuk suhu
    public void setSuhu(String suhu) {
        this.suhu = suhu;
    }

    public String getSuhu() {
        return suhu;
    }

    // Overriding method info
    @Override
    public String info() {
        return getNama() + " disajikan dengan rasa " + getRasa() + " dalam kondisi " + suhu;
    }
}

