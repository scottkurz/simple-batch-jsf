package package1;

import java.io.Serializable;
import java.util.List;
import javax.batch.api.chunk.ItemWriter;
import javax.inject.Named;

/* Write the filtered items */
@Named
public class ExampleWriter implements ItemWriter {

    @Override
    public void open(Serializable ckpt) throws Exception {
        
    }

    @Override
    public void close() throws Exception {
        
    }

    @Override
    public void writeItems(List<Object> items) throws Exception {
        
    }

    @Override
    public Serializable checkpointInfo() throws Exception {
        return new Serializable() {};
    }

}
