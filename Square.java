
import java.util.Scanner;

class Square
{

static int cols;
static int rows;
static char a;

Square(){

}
public char[][] DrawSquare
        (int sSides,char sChar,int cCols,char cChar) {
            
   char srArr[][] = new char[sSides+1][sSides+1];
    char charUse=sChar;
          for (int i = sSides; i >=0; i--) {
    for (int k = sSides; k >=0; k--) { 
        srArr[i][k]=charUse;
       }
    }
       return srArr;
} 

//function to rotate triangle 90 degrees anticlockwise
public void rotate90Anti(
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
 
// Function to zoomin

 
// Functions for print triangles

public void printMatrixMiddle(int n,char arr[][])
{
    for (int i = 0; i < n; i++)
    {
int l=0;
int m=((cols-n)/2);
    while(l<m) {
        System.out.print(a);
        l++;
    }
        for (int j = 0; j < n; j++){
        System.out.print( arr[i][j]);
   } 
   int j=cols-n-m;
    while(j>0){
    System.out.print(a);
    j--;
    }
System.out.println();
    }
    int fd=rows-n;
    if(fd!=0){
for (int row = 0; row < fd; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
}
}


public void printMatrixRight(int n,char arr[][])
{
    for (int i = 0; i < n; i++)
    {
    int l=0;
    while(l<cols-n) {
        System.out.print(a);
        l++;
    } 
        for (int j = 0; j < n; j++){
        System.out.print( arr[i][j]);
    } 
        System.out.println();
    }
    int fd=rows-n;
    if(fd!=0){
for (int row = 0; row < fd; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
}
}

public void printMatrixLeft(int n,char arr[][])
{
   
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++){
        System.out.print( arr[i][j]);
    } 
    int f=cols-n;  
    while(f>0) {
        System.out.print(a);
        f--;
    }
        System.out.println();
    }
  int fd=rows-n;
  if(fd!=0){
for (int row = 0; row < fd; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
}
}
 
    public static void main (String[] args)
    {
    //Triangle sq=new Triangle();
    //char[][] arr= sq.TestTriangle(N,t,2*N,a);
        /*     int b=2;
        Scanner in=new Scanner(System.in);
        char[][] arr= DrawSquare(b,t,cols,a);
        printMatrixLeft(b,arr);
        printMatrixMiddle(b,arr);
        printMatrixRight(b,arr);
        System.out.print("Proceed?");
        String zoom=in.nextLine();
        while(zoom.equals("Y")||zoom.equals("y")){
        
        arr= DrawSquare(b+1,t,cols,a);
        printMatrixLeft(b+1,arr);
        printMatrixMiddle(b+1,arr);
        printMatrixRight(b+1,arr);
        System.out.print("Proceed?");
        zoom=in.nextLine();
        b++;
        }*/
        
   
    
      /*
      printMatrixLeft(N,arr);
      System.out.println("left aligned square");
      
      printMatrixRight(N,arr);
      System.out.println("Right aligned square");
      
      printMatrixMiddle(N,arr);
      System.out.println("Middle aligned square");
      
      arr= DrawSquare(4,t,2*N,a);
      printMatrixMiddle(N,arr);
      System.out.println("Zooming in 1");
      String y=String.valueOf(N);
      N=N++;
      cols=cols;
      int z=Integer.parseInt(y);
      // int m=h;
      System.out.println(N+2 +" : "+cols+N+": "+z+1);*/


    }
}
 