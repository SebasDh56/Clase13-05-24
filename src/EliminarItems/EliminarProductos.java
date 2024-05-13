package EliminarItems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EliminarProductos {

    private static List<Producto> productos;

    private static Producto[] obtenerProductos(){
        Producto[] productos={
                new Producto("J&K","GRIS","pago","43L"),
                new Producto("K&L","Verde","pago","54L"),
                new Producto("J&K","Gris","pago","14L"),
                new Producto("k&l","Amarillo","pago","62L"),
                new Producto("Polo","GRIS","pago","34L"),
                new Producto("Lacoste","GRIS","pago","31L"),
        };
        return productos;
    }

    public static void main(String[] args){

        String[] marcas={"J&k","Lacoste"} ;

        List<Producto> productos =new ArrayList<>(Arrays.asList(obtenerProductos()));
        productos.forEach(System.out::println);


    }
    private static eliminarMarcaIterator(List<Producto>productos,List<String> marcas){



    }
    static class Producto{
        private String marca;
        private String color ;
        private String modelo;
        private String talla;


        public Producto(String marca, String color, String modelo, String talla) {
            this.marca = marca;
            this.color = color;
            this.modelo = modelo;
            this.talla = talla;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getTalla() {
            return talla;
        }

        public void setTalla(String talla) {
            this.talla = talla;
        }
    }


}
