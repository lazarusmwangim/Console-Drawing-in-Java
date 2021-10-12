
class Triangle
{
 
static int cols;
static int rows;
static char a;
static char t;

public static boolean isValid(){

    boolean sts=false;
return sts;
}

public char[][] DrawTriangle(int tSides,char tChar,int cCols,char cChar) {
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
 
// Function to rotate the triangle 90 degree clockwise
public void rotate90Clockwise(int n,char matrix[][])
{
    for (int i = 0; i < n / 2; i++)
    {
        for (int j = i; j < n - i - 1; j++)
        {
            char temp = matrix[i][j];
            matrix[i][j] = matrix[n - 1 - j][i];
            matrix[n - 1 - j][i] = matrix[n - 1 - i][n - 1 - j];
            matrix[n - 1 - i][n - 1 - j] = matrix[j][n - 1 - i];
            matrix[j][n - 1 - i] = temp;
        }
    }
}
 
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
 
/*public static void main (String[] args)
{
//Triangle sq=new Triangle();
//char[][] arr= sq.TestTriangle(b,t,2*b,a);
int b=8;
char[][] arr= DrawTriangle(b,t,2*b,a);
printMatrixLeft(b,arr);
System.out.println("Original");


rotate90Clockwise(b,arr);
printMatrixLeft(b,arr);
System.out.println("90 degrees");

rotate90Clockwise(b,arr);
printMatrixLeft(b,arr);
System.out.println("180 degrees");

rotate90Clockwise(b,arr);
printMatrixLeft(b,arr);
System.out.println("270 degrees");

rotate90Clockwise(b,arr);
printMatrixLeft(b,arr);
System.out.println("360 degrees");

rotate90Anti(b, arr);
printMatrixLeft(b, arr);
System.out.println("-90 degrees");

rotate90Anti(b, arr);
printMatrixLeft(b, arr);
System.out.println("-180 degrees");

rotate90Anti(b, arr);
printMatrixLeft(b, arr);
System.out.println("-270 degrees");

rotate90Anti(b, arr);
printMatrixLeft(b, arr);
System.out.println("-360 degrees");
}*/
}
 