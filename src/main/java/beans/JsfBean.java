package beans;

import java.util.logging.Logger;
import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/* Handles data for the JSF pages and starts the batch job */
@ManagedBean
@SessionScoped
public class JsfBean {
    private long execID;
    private JobOperator jobOperator;
    private static final Logger logger = Logger.getLogger("JsfBean");
    
    /* --JSF navigation method--
     * Starts the batch job and navigates to the next page */
    public String startBatchJob() {
        jobOperator = BatchRuntime.getJobOperator();
        execID = jobOperator.start("examplejob", null);
        return "jobstarted";
    }
    
    /* Show the current status of the job */
    public String getJobStatus() {
        return jobOperator.getJobExecution(execID).getBatchStatus().toString();
    }
}
