public class Carro {
     String modelo;
     String marca;
     int ano;

     public Carro(String modelo, String marca, int ano) {
         this.modelo = modelo;
         this.marca = marca;
         this.ano = ano;
     }
     @Override
     public String toString() {
         return "\n Modelo: " + modelo + "\n Marca: " + marca + "\n ano: " + ano;
     }
}
