interface Veiculo {
    void acelerar();
    void frear();
    default void ligar(){
        System.out.println("Vrum! ");
    }
}

