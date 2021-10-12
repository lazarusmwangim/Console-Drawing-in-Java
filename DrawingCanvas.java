
import java.util.Scanner;

/**
 *
 * @author User
 */
public class DrawingCanvas {
    
    public int cols;
    public int rows;
    public char a;
public Scanner in=new Scanner(System.in);
       public void drawCanv(int colms, int rowms, char am) {
    
    
    System.out.println("Current drawing canvas settings:");
    System.out.println("Width: "+colms);
    System.out.println("Height: "+rowms);
    System.out.println("Background character: "+am);
    cols=colms;
    rows=rowms;
    a=am;
    
    /**
    
    for (int row = 0; row < rows; row++) {
        for (int col = 0; col < cols; col++) {
       System.out.print(a);
        }
       System.out.println();
    }
    
     */   
   
    } 
     String typeOps;  
       public void mainS(){
       System.out.println("Please select an option. Type 4 to exit.\n" +
"1. Draw triangles\n" +
"2. Draw squares\n" +
"3. Update drawing canvas settings\n" +
"4. Exit");

typeOps=in.nextLine();


while(!"1".equals(typeOps) && !typeOps.equals("2") && !typeOps.equals("3") 
        && !typeOps.equals("4")){
System.out.println("Unsupported option. Please try again!\n" +
"Please select an option. Type 4 to exit.\n" +
"1. Draw triangles\n" +
"2. Draw squares\n" +
"3. Update drawing canvas settings\n" +
"4. Exit");

typeOps=in.nextLine();
}

    drawMain(typeOps);
  
       }
public void drawMain(String h) {
String typeOpt=h;
if(typeOpt.equals("1")){
    
    //triangle class
    //draw isosceles triangle
System.out.println("Side length:");
typeOpt=in.nextLine();

int sideSize=Integer.parseInt(typeOpt);
while(Integer.parseInt(typeOpt)>cols || Integer.parseInt(typeOpt)>rows){
    sideSize=Integer.parseInt(typeOpt);
System.out.println("Error! The side length is too long (Current canvas size is "+cols+"x"+rows+"). "
+ "Please try again");
System.out.println("Side length:");
typeOpt=in.nextLine();
sideSize=Integer.parseInt(typeOpt);
}
sideSize=Integer.parseInt(typeOpt);
System.out.println("Printing character:");
typeOpt=in.nextLine();
char tChar=typeOpt.charAt(0);
System.out.println("Alignment(left,middle,right):");
typeOpt=in.nextLine();
String alignTr=typeOpt;
while(!typeOpt.equals("left") && !typeOpt.equals("middle") && !typeOpt.equals("right")){
System.out.println("ERROR! Input the right option");
System.out.println("Alignment(left,middle,right):");
typeOpt=in.nextLine();
alignTr=typeOpt;
}
if(typeOpt.equals("left")){
    
    
    Triangle leftD=new Triangle();
    char[][] arr= leftD.DrawTriangle(sideSize,tChar,cols,a);
    leftD.printMatrixLeft(sideSize,arr);




}
else if(typeOpt.equals("middle")){
    
  Triangle middleD=new Triangle();
    char[][] arr= middleD.DrawTriangle(sideSize,tChar,cols,a);
    middleD.printMatrixMiddle(sideSize,arr);
}
else
{
    
Triangle rightD=new Triangle();
    char[][] arr= rightD.DrawTriangle(sideSize,tChar,cols,a);
    rightD.printMatrixRight(sideSize,arr);
}
//time to rotate the triangle
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
int b=sideSize;
Triangle rotateClock=new Triangle();
char[][] arr= rotateClock.DrawTriangle(sideSize,tChar,cols,a);
while(typeOpt.equals("R")||typeOpt.equals("r")||typeOpt.equals("L")||typeOpt.equals("l")){
if(typeOpt.equals("L")||typeOpt.equals("l")){
    
    if(alignTr.equals("left")){
rotateClock.rotate90Anti(sideSize,arr);
rotateClock.printMatrixLeft(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }
    else if(alignTr.equals("middle")){
rotateClock.rotate90Anti(sideSize,arr);
rotateClock.printMatrixMiddle(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }
    else if(alignTr.equals("right")){
rotateClock.rotate90Anti(sideSize,arr);
rotateClock.printMatrixRight(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }


}
    
else{ 
    
    if(alignTr.equals("left")){
rotateClock.rotate90Clockwise(sideSize,arr);
rotateClock.printMatrixLeft(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }
    else if(alignTr.equals("middle")){
rotateClock.rotate90Clockwise(sideSize,arr);
rotateClock.printMatrixMiddle(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }
    else if(alignTr.equals("right")){
rotateClock.rotate90Clockwise(sideSize,arr);
rotateClock.printMatrixRight(sideSize,arr);
System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
    }

}

}
/*while(typeOpt.equals("L")||typeOpt.equals("l")){
System.out.println("Rotating anticlockwise");

rotateClock.rotate90Clockwise(sideSize,arr);
rotateClock.printMatrixLeft(sideSize,arr);
System.out.println("90 degrees");

System.out.println("Type R/L to rotate clockwise/anticlockwise. Use other keys to continue");
typeOpt=in.nextLine();
}*/


System.out.println("Draw another triangle (Y/N)?");
typeOpt=in.nextLine();

while(!typeOpt.equals("Y") && !typeOpt.equals("N")){
System.out.println("Unsupported option. Please try again!");
System.out.println("Draw another triangle (Y/N)?");
typeOpt=in.nextLine();
}

//go to main menu if no
if(typeOpt.equals("N")){
 mainS();   

}
else{
drawMain("1");
    
}

}


///////////////////////////////the square now
else if(typeOpt.equals("2")){
    
    //square class
System.out.println("Side length:");
typeOpt=in.nextLine();
int sideSize=Integer.parseInt(typeOpt);
while(Integer.parseInt(typeOpt)>cols || Integer.parseInt(typeOpt)>rows){
System.out.println("Error! The side length is too long (Current canvas size is 10x6). Please try again");
System.out.println("Side length:");
typeOpt=in.nextLine();
sideSize=Integer.parseInt(typeOpt);
}
int sLen=Integer.parseInt(typeOpt);
System.out.println("Printing character:");
typeOpt=in.nextLine();
char sChar=typeOpt.charAt(0);
System.out.println("Alignment(left,middle,right):");
typeOpt=in.nextLine();
String alignS=typeOpt;
while(!typeOpt.equals("left") && !typeOpt.equals("middle") && !typeOpt.equals("right")){
System.out.println("ERROR! Input the right option");
System.out.println("Alignment(left,middle,right):");
typeOpt=in.nextLine();
alignS=typeOpt;
}

if(typeOpt.equals("left")){

    Square leftS=new Square();
    char[][] arr= leftS.DrawSquare(sideSize,sChar,cols,a);
    leftS.printMatrixLeft(sideSize,arr);

}

else if(typeOpt.equals("middle")){
    
   Square middleS=new Square();
    char[][] arr= middleS.DrawSquare(sideSize,sChar,cols,a);
    middleS.printMatrixMiddle(sideSize,arr);
}

else
{
    
Square rightS=new Square();
    char[][] arr= rightS.DrawSquare(sideSize,sChar,cols,a);
    rightS.printMatrixRight(sideSize,arr);
}
//time to zoom the square
System.out.println("Type I/O to zoom in/out. Use other keys to continue");
typeOpt=in.nextLine();





Square sq=new Square();
int b=sideSize;
char[][] arr= sq.DrawSquare(b,sChar,cols,a);

while((typeOpt.equals("I")||typeOpt.equals("i")||typeOpt.equals("O")||typeOpt.equals("o"))){
   // zoomIn();&&b!=0
   while((typeOpt.equals("I")||typeOpt.equals("i"))&& b<rows){
       arr= sq.DrawSquare(b+1,sChar,cols,a);
       if(alignS.equals("left"))
            sq.printMatrixLeft(b+1,arr);
       else if(alignS.equals("middle"))
            sq.printMatrixMiddle(b+1,arr);
       else if(alignS.equals("right"))
            sq.printMatrixRight(b+1,arr);
      
    b++;
      
System.out.println("Type I/O to zoom in/out. Use other keys to continue");
typeOpt=in.nextLine();

}
while((typeOpt.equals("O")||typeOpt.equals("o"))&& b!=1){


 arr= sq.DrawSquare(b-1,sChar,cols,a);
 if(alignS.equals("left"))
       sq.printMatrixLeft(b-1,arr);
 if(alignS.equals("middle"))
       sq.printMatrixMiddle(b-1,arr);
 if(alignS.equals("right"))
       sq.printMatrixRight(b-1,arr);

    b--;
System.out.println("Type I/O to zoom in/out. Use other keys to continue");
typeOpt=in.nextLine();

}
while((typeOpt.equals("O")||typeOpt.equals("o")) && b==1){
System.out.println("Zooming out");

 arr= sq.DrawSquare(b,sChar,cols,a);
 if(alignS.equals("left"))
       sq.printMatrixLeft(b,arr);
 if(alignS.equals("middle"))
       sq.printMatrixMiddle(b,arr);
 if(alignS.equals("right"))
       sq.printMatrixRight(b,arr);

System.out.println("Type I/O to zoom in/out. Use other keys to continue");
typeOpt=in.nextLine();
b=b;
}

while((typeOpt.equals("I")||typeOpt.equals("i")) && b==rows){
arr= sq.DrawSquare(b,sChar,cols,a);
       if(alignS.equals("left"))
            sq.printMatrixLeft(b,arr);
       else if(alignS.equals("middle"))
            sq.printMatrixMiddle(b,arr);
       else if(alignS.equals("right"))
            sq.printMatrixRight(b,arr);
b=b;
System.out.println("Type I/O to zoom in/out. Use other keys to continue");
typeOpt=in.nextLine();
}

}

System.out.println("Draw another square (Y/N)?");
typeOpt=in.nextLine();

while(!typeOpt.equals("Y") && !typeOpt.equals("N")){
System.out.println("Unsupported option. Please try again!");
System.out.println("Draw another square (Y/N)?");
typeOpt=in.nextLine();
}

//go to main menu if no
if(typeOpt.equals("N")){
 mainS();
}
else{
    drawMain("2");
}


}





/////////////////////////set another canvas
else if(typeOpt.equals("3")){
    
    //drawing canvas class
System.out.print("Canvas width: ");
typeOpt=in.nextLine();
int colsR=Integer.parseInt(typeOpt);
System.out.print("Canvas height: ");
typeOpt=in.nextLine();
int rowsR=Integer.parseInt(typeOpt);
System.out.print("Background character: ");
typeOpt=in.nextLine();
char aR=typeOpt.charAt(0);
Triangle.cols=colsR;
       Triangle.rows=rowsR;
       Triangle.a=aR;
       Square.cols=colsR;
       Square.rows=rowsR;
       Square.a=aR;
drawCanv(colsR, rowsR, aR);
mainS();


}



//////quit the program
else if(typeOpt.equals("4")){
    
   // exit
System.out.println("Goodbye!");
System.exit(0);
}
else{
System.out.println("Sorry");
}


  
    
        }
}