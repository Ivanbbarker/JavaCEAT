interface Sonido {
    void voz();

    default void vozDurmiendo() {
        System.out.println("Zzzz");
    }

    static void bostezo(){
        System.out.println("Auuu");
    }
}