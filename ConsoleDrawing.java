import static java.lang.Integer.min;
import java.util.Scanner;

public class ConsoleDrawing {

    /**
     * @param <error>
     * @param <error>
     * @param args the command line arguments
     */
    


    public static void main(String[] args) {
        
       int cols;
       int rows;
       char a;
        //TODO code application logic here
        cols=Integer.parseInt(args[0]);
        rows=Integer.parseInt(args[1]);
        a=args[2].charAt(0);
       
       
        /* a='-';
        cols=10;
        rows=10;
        */
       Triangle.cols=cols;
       Triangle.rows=rows;
       Triangle.a=a;
       Square.cols=cols;
       Square.rows=rows;
       Square.a=a;
       
       System.out.println("----WELCOME TO MY CONSOLE DRAWING APP----");
        DrawingCanvas dC=new DrawingCanvas();
        dC.drawCanv(cols, rows, a);
        dC.mainS();
      }
 }
    

