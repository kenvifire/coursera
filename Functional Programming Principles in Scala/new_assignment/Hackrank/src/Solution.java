import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        in.useDelimiter("\n");

        //init data
        List<Mountain> mountains = new ArrayList<Mountain>(n+1);
        int maxEnd =0;
        for(int i = 0; i < n; i++) {
            String str = in.next();
            String[] params = str.split(",");
            int start =Integer.parseInt(params[0]);
            int end = Integer.parseInt(params[1]);
            int height = Integer.parseInt(params[2]);
            if(end > maxEnd){//find max end
                maxEnd=end;
            }
            Mountain m = new Mountain(start,end,height);
            mountains.add(m);
        }
        //add default mountain
        Mountain defaultMountain = new Mountain(0,maxEnd,0);
        mountains.add(defaultMountain);
        //sort by start
        Collections.sort(mountains);

        int a =0;
        Mountain current = defaultMountain;
        List<Point> points = new ArrayList<Point>();
        points.add(new Point(0,0));

        while (a <= maxEnd) {//climb
            //get mountains at current position
            List<Mountain> mountainList = getMountains(mountains, a);

            //get highest mountain at current position
            Mountain max = getHighestMountains(mountainList);

            //if on edge,climb down
            if(current.isOnEdge(a)) {
                mountainList.remove(current);
                max = getHighestMountains(mountainList);
            }


            if (!max.equals(current)) {//change to new mountain
                Point currentPos = new Point(a, current.height);
                Point nextPos = new Point(a, max.height);
                points.add(currentPos);
                points.add(nextPos);

                current = max;
            }
            a++;

        }
        // add end point
        points.add(new Point(maxEnd,0));

        int total = 0;
        for(int i=0;i<points.size()-2;i++){
            total += points.get(i).distanceTo(points.get(i+1));
        }
        //out put points
        for(int i=0;i<points.size();i++){
            System.out.println("Point:"+points.get(i).x+","+points.get(i).y);
        }

        //

        System.out.println(total);

    }

    //get mountains
    static List<Mountain> getMountains(List<Mountain>mountains,int position){
        List<Mountain> result = new ArrayList<Mountain>();
        for(Mountain m:mountains){
            if(m.isIncluded(position)){
                result.add(m);
            }
        }
        return result;

    }

    static Mountain getHighestMountains(List<Mountain> mountains){
        int maxHeight=mountains.get(0).height;
        Mountain result = mountains.get(0);
        for(Mountain m:mountains){
            if(m.height > maxHeight){
                maxHeight = m.height;
                result = m;
            }
        }
        return result;
    }



    static class Mountain implements Comparable<Mountain>{
        private int start,end,height;
        public Mountain(int start, int end, int height){
            this.start = start;
            this.end = end;
            this.height = height;
        }

        @Override
        public int compareTo(Mountain that) {
            return this.start- that.start;
        }

        public boolean isIncluded(int position){
            return position>=start && position<=end;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj instanceof Mountain){
                Mountain that = (Mountain) obj;
                return (this.start == that.start)
                        &&(this.end == that.end)
                        &&(this.height == that.height);
            }
            return false;

        }

        boolean isOnEdge(int position){
            return this.end == position;
        }
    }

    static class Point{
        int x,y;
        public Point(int x,int y){
            this.x = x;
            this.y = y;
        }

        public int distanceTo(Point that){
            return Math.abs(that.x-this.x + that.y-this.y);
        }
    }


}
