public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {
        double squareA = Math.pow(legA, 2);
        double squareB = Math.pow(legB, 2);
        double hypotenuse = Math.sqrt(squareA + squareB);
        return hypotenuse;
    }
}