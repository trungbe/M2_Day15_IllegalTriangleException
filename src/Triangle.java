public class Triangle {
    private double a, b, c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b<= 0 || c<=0) {
            throw new IllegalTriangleException("Cạnh là số âm");
        }
        if (a+b<=c || b+c<=a || a+c <= b){
            throw new IllegalTriangleException("Đây không phải cạnh của tam giác");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
