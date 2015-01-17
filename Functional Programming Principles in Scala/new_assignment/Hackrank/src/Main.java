/**
 * Created by kenvi on 2014-05-17.
 */
public class Main {

    public static void  main(String [] args){
        int matrix[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        oper(5,3,matrix,1,0,2,0,4);

    }


    /*static int[] convertMatrix(int width, int height, int[] matrix) {
        oper(width,height,matrix,0,height-1,0,width-1);

    }*/

    static  void oper(int width,int height,int[] matrix,int oper,int startX,int endX,int startY,int endY){
        System.out.println("start...");
        //
        if(oper == 1){//to left
            System.out.println("to left");
           //travels current line
           for(int i=startY;i<endY;i++) {
               System.out.println("left");
               System.out.println(matrix[startX*width+i]);
           }
           //turn to left down
           if(startX<startY){
               oper(width,height,matrix,2,startX+1,endX,startY,endY-1);
           }


        }
        //
        if(oper ==2 ) { //to left down
            System.out.println("to left down");
            int i=startX,j=endY;
            for(;i<=endX && j>=startY;i++,j--){
                System.out.println("right");
                System.out.println(matrix[i*width+j]);
            }
            //turun to right
            if(i>endX){
               oper(width,height,matrix,3,startX,endX,startY,endY-(endX-startX)) ;
            }
            //turn to up
           else{
                oper(width,height,matrix,4,startX+1,endX,startY,endY-1);

            }


        }
        //
        if(oper == 3){//to right
            System.out.println("to right");
            for(int i=endY;i>=startY;i--){
                System.out.println("right");
               System.out.println(matrix[endX*width + i]);
            }

            //to up
            if(endX > startX){
                oper(width,height,matrix,3,startX,endX-1,startY,endY);
            }

        }

        //
        if(oper == 4) {// to up
            System.out.println("to up");
            for(int i=endX;i>= startX;i--){
                System.out.println("up");
                System.out.println(matrix[i*width+startY]);
            }

            //to right
            if(startX>startY){
                oper(width,height,matrix,3,startX,endX-1,startY,endY);
            }
        }

    }

}
