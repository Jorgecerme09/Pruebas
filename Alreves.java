import java.util.Scanner;

public class Alreves {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Escribe el texto que quieres escribir al revés: ");
        String texto=reader.nextLine();
        String copiatexto=texto.replaceAll(" ","");

        System.out.println("Tu texto escrito al revés es el siguiente: ");

        for (int i=copiatexto.length()-1;i>=0;i--){
            System.out.print(copiatexto.charAt(i));
        }
    }
}