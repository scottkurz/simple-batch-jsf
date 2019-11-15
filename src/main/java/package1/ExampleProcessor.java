package package1;

import javax.batch.api.chunk.ItemProcessor;
import javax.inject.Named;

/* Processes items from the log file
 * Filters only those items from mobile or tablet browsers */
@Named
public class ExampleProcessor implements ItemProcessor {

    public ExampleProcessor() {
        
    }

    @Override
    public Object processItem(Object item) {
        return item;
    }
}

