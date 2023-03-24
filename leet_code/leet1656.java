package leet_code;

import java.util.ArrayList;
import java.util.List;

class OrderedStream {
    String[] values;
    int ptr=0;
    public OrderedStream(int n) {
        values=new String[n];
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> output = new ArrayList();
        values[idKey - 1] = value;
        while (ptr < values.length && values[ptr] != null) {
            output.add(values[ptr++]);
        }
        return output;
    }
}
