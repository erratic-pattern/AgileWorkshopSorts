package agileworkshopsorts;

/**
 *
 * @author Adam Curtis
 
 This a dummy implementation of the IArrayProvider interface. The result
 is a randomly generated array of integers. This class is intended to be
 used for testing purposes only.
 * 
 */
public class RandomArrayProvider implements IArrayProvider<Integer> {
    
    @Override
    public Integer[] generateArray() {
        int len = (int) (Math.random() * 100);
        Integer[] out = new Integer[len];
        for(int i = 0; i < out.length; i++ ) {
            out[i] = (int) (Math.random() * 100);
        }
        return out;
    }
}
