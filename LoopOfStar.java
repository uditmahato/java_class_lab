public class LoopOfStar {
    public static void main(String[] args){
        String x = " * ";
        for( int i=0; i<=2;i++){
            for (int j = 0; j<=2;j++){
                System.out.print(x);
            }
            System.out.println("  ");
        }
    }
}
