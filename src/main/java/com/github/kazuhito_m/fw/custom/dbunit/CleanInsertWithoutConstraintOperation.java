package com.github.kazuhito_m.fw.custom.dbunit;

import org.dbunit.operation.CompositeOperation;
import org.dbunit.operation.DatabaseOperation;

public class CleanInsertWithoutConstraintOperation extends CompositeOperation {

    public static final DatabaseOperation CLEAN_INSERT_WITHOUT_CONSTRAINT = new CleanInsertWithoutConstraintOperation();
    
    public CleanInsertWithoutConstraintOperation() {
        super(new DatabaseOperation[]{CLEAN_INSERT});
    }
}
