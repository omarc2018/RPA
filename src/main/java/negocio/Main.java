package negocio;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException{
        MedidaEficiencia medir = new MedidaEficiencia();
        medir.eficiencia();
    }
}
