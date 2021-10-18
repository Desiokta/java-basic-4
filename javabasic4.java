import java.util.Scanner;
public class javabasic4 {
//method  atau function


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nilai;
        
        System.out.println("input nilai");
        nilai = scan.nextInt();

        lihatnilai(nilai);

    }
    
    static void lihatnilai (int nilai){

    if (nilai >= 0 && nilai <= 20) {
        System.out.println(" Nilai Anda: E");
    } else if (nilai >= 21 && nilai <= 40) {
        System.out.println("Nilai Anda: D");
    } else if (nilai >= 41 && nilai <= 60) {
        System.out.println("Nilai Anda: C");
    } else if (nilai >= 61 && nilai <= 80) {
        System.out.println("Nilai Anda: B");
    } else if (nilai >= 80 && nilai <= 100) {
        System.out.println("Nilai Anda: A");
    } else if (nilai >= 100) {
        System.out.println("Invalid Value");

    }

}
}



        // static void  myMethod(){
        //     System.out.println(" Nilai Anda: E");
        //     System.out.println("Nilai Anda: D");
        //     System.out.println("Nilai Anda: C");
        //     System.out.println("Nilai Anda: B");
        //     System.out.println("Nilai Anda: A");
        //     System.out.println("Invalid Value");
    
    

