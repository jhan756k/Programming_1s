import java.lang.Math;

public class regular_pentagon {
    
    private int sidelength;
    public static int count = 0;

    public regular_pentagon(){
        this(2);
    }   

    public regular_pentagon(int sidelength){
        count++;
        System.out.println("This is the " + count + "th pentagon.");
        System.out.println("The sidelength of the " + count + "th pentagon will be " + sidelength + ".");
        this.sidelength = sidelength;
    }

    public int getSideLength(){
        return sidelength;
    }

    public int area(){
        return (int) (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * Math.pow(getSideLength(), 2) / 4);
    }

    public int perimeter(){
        return 5 * getSideLength();
    }

    public double inscribedCircle(){
        double radius = getSideLength()/2.0*Math.tan(Math.PI/180*36);
        return radius;
    }

    public double circumCircle(){
        double radius = getSideLength()/2.0/Math.sin(Math.PI/180*36);
        return radius;
    }
}