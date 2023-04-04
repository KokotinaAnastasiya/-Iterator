import java.util.Random;
public class Randoms implements  Iterable<Integer>{
    protected Random random;
    int min;
    int max;
    public Randoms(int min, int max){
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return new Iterator(min, max ,random);
    }
    class Iterator implements java.util.Iterator{

        int min;
        int max;
        protected Random random;
        public Iterator(int min, int max, Random random){
            this.min = min;
            this.max = max;
            this.random = random;
        }

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int range = max - min;
            return min + random.nextInt(range + 1);
        }
    }
}
