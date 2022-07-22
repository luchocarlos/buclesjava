public class Main {
    public static void main(String[] args) {
        int numeroIf = 8;
        if(numeroIf == 0 ){
            System.out.println("numeroIf es 0");
        }else if(numeroIf > 0 ){
            System.out.println("numeroIf es positivo");
        }else if(numeroIf < 0 ) {
            System.out.println("numeroIf es negativo");
        }

        int numeroWhile = 0;
        while(numeroWhile <= 3){
            System.out.println("numero while vale "+numeroWhile);
            numeroWhile++;
        }

        int numeroDoWhile = 3;
        do{
            System.out.println("numero do while vale "+numeroDoWhile);
            numeroDoWhile++;
        } while(numeroDoWhile < 3);

        int numeroFor = 0;
        for(int i = 0; numeroFor <= 3; i++){
            System.out.println("numeroFor "+numeroFor);
            numeroFor++;
        }

        int grados = 18;
        switch (grados){
            case 0:
                System.out.println("invierno");
                break;
            case 18:
                System.out.println("otoño");
                break;
            case 25:
                System.out.println("verano");
                break;
            case 30:
                System.out.println("primavera");
                break;
            default:
                System.out.println("no esta dentro de una de las 4 estaciones");
                break;
        }

    }

}