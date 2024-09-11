package confectionery;

import java.util.Comparator;

class ChocolateWeightComparator implements Comparator<Chocolate> {
    @Override
    public int compare(Chocolate c1, Chocolate c2) {
        return Double.compare(c1.getWeight(), c2.getWeight());
    }
}