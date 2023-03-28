package com.example;

import java.io.Serializable;
import com.oracle.nosql.spring.data.core.mapping.NosqlKey;


public class MachineId implements Serializable {
    private static final long serialVersionUID = 1L;
    @NosqlKey(order = 0)
    private String name;
    @NosqlKey(order = 0)
    private String version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "MachineId{" +
            "name='" + name + '\'' +
            ", version='" + version + '\'' +
            '}';
    }
}
