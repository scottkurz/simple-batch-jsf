package package1;

import java.io.Serializable;
import javax.batch.api.chunk.ItemReader;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.inject.Named;

/* Reads lines from the input log file */
@Named
public class ExampleReader implements ItemReader {
    
    @PersistenceContext
    EntityManager em;
    
    public ExampleReader() {
    
    }

    @Override
    public void open(Serializable ckpt) throws Exception {
        System.out.println(em.toString());
    }

    @Override
    public void close() throws Exception {
        
    }

    @Override
    public Object readItem() throws Exception {
        return null;
    }

    @Override
    public Serializable checkpointInfo() throws Exception {
        return new Serializable(){};
    }
}

