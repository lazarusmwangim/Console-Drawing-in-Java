import java.io.*;


class Solution {
   static void rotateMatrix(
      int n, char matrix[][]){
         for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               char temp= matrix[i][j];
               matrix[i][j]= matrix[j][i];
               matrix[j][i]= temp;
            }
         }
   for(int i=0;i<n;i++){
      int top=0;
      int bottom = n-1;
      while(top<bottom){
         char temp = matrix[top][i];
         matrix[top][i]=matrix[bottom][i];
         matrix[bottom][i] = temp;
         top++;
         bottom--;
      }
   }
}
static void displayMatrix(int N, char mat[][]){
   for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++)
         System.out.print(mat[i][j]);
         System.out.print("\n");
      }
      System.out.print("\n");
   }
   public static void main(String[] args){
      int N = 5;
      char mat[][] = {
         { 'A', 'A', 'A', 'A' ,'A'},
                      {  'A', 'A', 'A', 'A' ,'-' },
                      { 'A', 'A', 'A', '-', '-' },
                      { 'A', 'A','-','-', '-' },
                      { 'A','-', '-', '-', '-'}
      };
      
      displayMatrix(N, mat);
      System.out.println("Original");
      
      rotateMatrix(N, mat);
      displayMatrix(N, mat);
      System.out.println("90 degrees");
      
      rotateMatrix(N, mat);
      displayMatrix(N, mat);
      System.out.println("180 degrees");
      
      rotateMatrix(N, mat);
      displayMatrix(N, mat);
      System.out.println("270 degrees");
      
      rotateMatrix(N, mat);
      displayMatrix(N, mat);
      System.out.println("360 degrees");
   }
}