public class ConversionTipos {
    public static void main(String[] args) {

        //TIPOS DE DATOS PRIMITIVOS

        int i = 1000/(int)3.5;
        double r = i;
        System.out.println("r = " + r);
        //No se puede castear un int a un boolean
        char caracter = 'a';
        int charToInt = (int)caracter;
        System.out.println("charToInt = " + charToInt);
        

        //De String entero
        String numero = "20";
        Integer numEntero = Integer.parseInt(numero);
        numEntero = numEntero + 10;
        System.out.println("De string a entero = " + numEntero);

        //de string a real
        String realStr = "20.50";
        Double real = Double.parseDouble(realStr);
        System.out.println("De string a real = " + real);
        //Entero a String
        Integer n = 20;
        String numStr = Integer.toString(n);
        System.out.println("De Integer a String = " + n);
        
        //Otra forma de entero a string
        Integer n2 = 25;
        String Strn2 = String.valueOf(n2+20);
        System.out.println("Strn2 = " + Strn2);
        
        double realDouble = 2.5;
        String realToString = String.valueOf(realDouble);
        System.out.println("realToString = " + realToString);

    }
}
