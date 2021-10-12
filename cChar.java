

class GFG
{
  
static int N=19;
static int cols=10;
static int rows=6;
static char a='-';
static char t='A';

public static char[][] DrawTriangle(int tSides,char tChar,int cCols,char cChar) {
   char trArr[][] = new char[tSides+1][tSides+1];
    char charUse=tChar;
          for (int i = tSides; i >=0; i--) {
    for (int k = tSides; k >=0; k--) { 
        if(k<tSides-i && i!=tSides)
            charUse=tChar;
        else 
            charUse=cChar;
        
        trArr[i][k]=charUse;
       }
    }
       return trArr;
} 

//function to rotate triangle 90 degrees anticlockwise
public static void rotate90Anti(
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
 
// Function to rotate the triangle 90 degree clockwise
public static void rotate90Clockwise(int n,char matrix[][])
{
 N=n;
    for (int i = 0; i < N / 2; i++)
    {
        for (int j = i; j < N - i - 1; j++)
        {
            char temp = matrix[i][j];
            matrix[i][j] = matrix[N - 1 - j][i];
            matrix[N - 1 - j][i] = matrix[N - 1 - i][N - 1 - j];
            matrix[N - 1 - i][N - 1 - j] = matrix[j][N - 1 - i];
            matrix[j][N - 1 - i] = temp;
        }
    }
}
 
// Functions for print triangles

public static void printMatrixMiddle(int n,char arr[][])
{
    N=n;
    for (int i = 0; i < N; i++)
    {
int l=0;
int m=((cols-N)/2);
    while(l<m) {
        System.out.print(a);
        l++;
    }
        for (int j = 0; j < N; j++){
        System.out.print( arr[i][j]);
   } 
   int j=cols-N-m;
    while(j>0){
    System.out.print(a);
    j--;
    }
System.out.println();
    }
    int fd=rows-N;
    if(fd!=0){
for (int row = 0; row < fd; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
}
}


public static void printMatrixRight(int n,char arr[][])
{
    N=n;
    for (int i = 0; i < N; i++)
    {
    int l=0;
    while(l<cols-N) {
        System.out.print(a);
        l++;
    } 
        for (int j = 0; j < N; j++){
        System.out.print( arr[i][j]);
    } 
        System.out.println();
    }
    int fd=rows-N;
    if(fd!=0){
for (int row = 0; row < fd; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
}
}

public static void printMatrixLeft(int n,char arr[][])
{
    N=n;
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++){
        System.out.print( arr[i][j]);
    } 
    int f=cols-N;  
    while(f<cols) {
        System.out.print(a);
        f++;
    }
        System.out.println();
    }
  int fd=rows-N;
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
    char[][] arr= DrawTriangle(N,t,10,a);
    printMatrixLeft(N,arr);
    System.out.println("Original");
    
    
    rotate90Clockwise(N,arr);
    printMatrixLeft(N,arr);
     System.out.println("90 degrees");
   
    rotate90Clockwise(N,arr);
    printMatrixLeft(N,arr);
     System.out.println("180 degrees");
   
    rotate90Clockwise(N,arr);
    printMatrixLeft(N,arr);
     System.out.println("270 degrees");
    
    rotate90Clockwise(N,arr);
    printMatrixLeft(N,arr);
     System.out.println("360 degrees");
    
      rotate90Anti(N, arr);
      printMatrixLeft(N, arr);
      System.out.println("-90 degrees");
      
     rotate90Anti(N, arr);
      printMatrixLeft(N, arr);
      System.out.println("-180 degrees");
      
      rotate90Anti(N, arr);
      printMatrixLeft(N, arr);
      System.out.println("-270 degrees");
      
      rotate90Anti(N, arr);
      printMatrixLeft(N, arr);
      System.out.println("-360 degrees");
    }
}
 