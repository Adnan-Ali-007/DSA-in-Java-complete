public class Boxweght extends Box{
    int weight;
    public Boxweght(int weight) {
        this.weight = weight;
    }
    public Boxweght(double l, double h, double w, int weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
