public class encapsulationAccessClass {

    public static void main(String[] args) {
        encapsulationClass w=   new encapsulationClass();
        System.out.println(w.getAge());
        w.setAge(43);
        System.out.println(w.getAge());
    }
}
