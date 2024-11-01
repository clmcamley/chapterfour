//Exercise 4.3

public class EstimateGeographicArea {
    public static void main(String[] args) {
        double x1 = 33.7489954;
        double y1 = -84.3879824;
        double x2 = 35.2270869;
        double y2 = -80.8431267;
        double x3 = 32.0835407;
        double y3 = -81.0998342;
        double x4 = 28.5383355;
        double y4 = -81.3792365;

        double RADIUS = 6371.01;

        double side1 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        double side2 = RADIUS * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
        double side3 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
        double side4 = RADIUS * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) * Math.cos(x4) * Math.cos(y3 - y4));
        double side5 = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x4) + Math.cos(x1) * Math.cos(x4) * Math.cos(y1 - y4));

        double s1 = (side1 + side2 + side3) / 2;
        double s2 = (side3 + side4 + side5) / 2;

        double area = Math.pow(s1 * (s1 - side1) * (s1 - side2) * (s1 - side3), 0.5) + Math.pow(s2 * (s2 - side3) * (s2 - side4) * (s2 - side5), 0.5);

        System.out.println("The area between Atlanta, Orlando, Savannah, and Charlotte is approximately " + area + " km squared");
    }
}
