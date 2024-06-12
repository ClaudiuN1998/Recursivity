package recursivity;

public class RecursivityHomework {

    public static void main(String[] args){
        exercitiu(12345);
        exercitiuVariantaADouaMaiSimpla(12345);
    }

    public static void exercitiu(int number){
        int sum = 0;
        while (number>0){
            int lastDigit= number%10;
            sum+= lastDigit;
            number = number/10;
        }
        System.out.println(sum);

    }

    public static void exercitiuVariantaADouaMaiSimpla(int number2){
        int sum2 = 0;
        while (number2>0){
            sum2 += number2 % 10;
            number2 /= 10;
        }
        System.out.println(sum2);
    }
}

