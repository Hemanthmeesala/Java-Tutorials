public class Strings {
    public static void main(String a[]){
        // String name = new String("Hemanth");
        String name = "Hemanth";
        System.out.println(name);

        // Mutable - Which can be Chnaged
        // Immutable - which cannot be changed

        StringBuffer sb = new StringBuffer("Hemanth");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("Kumar");
        System.out.println(sb);
    }
}
