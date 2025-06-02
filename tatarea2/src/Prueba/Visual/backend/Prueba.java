package Prueba.Visual.backend;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Observable;

public class Prueba extends Observable{
    public void cargarItems() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("Archivo_Prueba.csv"));
            String linea = reader.readLine();
            while(linea != null){
                String[] Preguntas = linea.split(";");
                Item ItemNuevo = new Item(Preguntas[0],Preguntas[1], Preguntas[2],Preguntas[3]);
                this.Preguntas.add(ItemNuevo);
                linea = reader.readLine();
            }
            reader.close();
            this.setChanged();
            this.notifyObservers();

        }
        catch(Exception ex){
            System.out.println("Error");
        }
    }

    public class Items extends Observable {
        private ArrayList<Item> preguntas;
        public Items(){
            this.preguntas = new ArrayList<>();
        }
        public ArrayList<Item> getPreguntas() {
            return preguntas;
        }



        }

    }


}
