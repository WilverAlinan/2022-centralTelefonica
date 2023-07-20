package org.wilvertoj.laboratorio;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.wilvertoj.laboratorio.entities.LlamadaInterior;
import org.wilvertoj.laboratorio.entities.LlamadaLocal;
import org.wilvertoj.laboratorio.sistema.CentralTelefonica;

@SpringBootApplication
public class CentraltelefonicaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CentraltelefonicaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        LlamadaLocal llamadaUno = new LlamadaLocal("33124569","45781515",120);
        LlamadaLocal llamadaDos = new LlamadaLocal("33124569","24711529",220);

        LlamadaInterior llamadaInteriorUno = new LlamadaInterior("33124569","7845123",145,1);
        LlamadaInterior llamadaInteriorDos = new LlamadaInterior("33124569","77456912",245,2);
        LlamadaInterior llamadaInteriorTres = new LlamadaInterior("33124569","7823569",540,3);


        CentralTelefonica central = new CentralTelefonica();
        central.registrarLlamada(llamadaUno);
        central.registrarLlamada(llamadaDos);
        central.registrarLlamada(llamadaInteriorUno);
        central.registrarLlamada(llamadaInteriorDos);
        central.registrarLlamada(llamadaInteriorTres);

        System.out.println("Total de llamadas: " + central.getTotalLlamadas());
        System.out.println("Total Facturado: " + central.getTotalFacturas());

    }
}
