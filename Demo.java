class Computer {
    public void PlayMusic() {
        System.out.println("Playing music");
    }

    public String GetMeAPen(int cost) {
        return "Pen";
    }
}

public class Demo {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.PlayMusic();
        String str = obj.GetMeAPen(10);
        System.out.println(str);
    }
}

