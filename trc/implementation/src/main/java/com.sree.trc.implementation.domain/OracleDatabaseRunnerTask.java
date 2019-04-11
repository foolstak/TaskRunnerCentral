package com.sree.trc.implementation.domain;

import com.sree.trc.framework.domain.Task;
import com.sree.trc.framework.domain.TaskParameter;

import java.util.List;

public class OracleDatabaseRunnerTask extends Task {
    public OracleDatabaseRunnerTask(long taskId, List<TaskParameter> taskParameterList, String taskName, boolean editable, boolean continueOnFailure, int executionSequenceNumber, String runParameter) {
        super(taskId, taskParameterList, taskName, editable, continueOnFailure, executionSequenceNumber, runParameter);
    }
}
