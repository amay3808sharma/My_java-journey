import java.util.Scanner;
public class find_value_matrix{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int matrix[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }}
            int x=sc.nextInt();
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(matrix[i][j]==x){
                        matrix[i][j]=x;
                        System.out.print("the value found : "+ i +" " + j + " " );


                    }
                   
                }
                System.out.println();
            }
        }



    }
