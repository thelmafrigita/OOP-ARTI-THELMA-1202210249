public class Calculation implements Runnable {
    double radius,side,area,a,b,t;
    double phi = 3.14;

    @Override
    public void run() {
        System.out.print("Program will start in ");
        try {
            for(var i = 3 ; i > 0 ; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double getCircle() {
        return area;
    }

    public double getSquare() {
        return area;
    }

    public double getTrapezoid(){
        return area;
    }

    public double getArea() {
        return area;
    }

    public double getPhi() {
        return phi;
    }

    public void setCircle(double radius) {
        this.radius = radius;
        try {
            area = phi * (radius*radius);
            if(radius < 1){
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        
        }
    }

    public void setSquare(double side) {
        this.side = side;
        try {
            area = side * side;
            if(side < 1){
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        
    }
}

    public void setTrapezoid(double a, double b, double t){
        this.a = a;
        this.b = b;
        this.t = t;
        try {
            area = (a+b)*t;
            if(a < 1 && b < 1){
                throw new IllegalStateException();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
        
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

}