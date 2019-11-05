/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.drools.scenariosimulation.api.utils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Class which contains shared Constants in Scenario Simulation module
 */
public class ConstantsHolder {

    /* Constants for manage MVEL expressions */
    public static final String MVEL_ESCAPE_SYMBOL = "#";
    public static final String ACTUAL_VALUE_IDENTIFIER = "actualValue";

    /* Simple types reserved field name */
    public static final String VALUE = "value";

    /* FEEL constants */
    public static final String UNARY_PARAMETER_IDENTIFIER = "?";

    public static final String DMO_SESSION_NODE = "dmoSession";
    public static final String EXPRESSION_IDENTIFIER_NODE = "expressionIdentifier";
    public static final String EXPRESSION_ELEMENTS_NODE = "expressionElements";
    public static final String FACT_IDENTIFIER_NODE = "factIdentifier";
    public static final String FACT_MAPPING_NODE = "FactMapping";
    public static final String FACT_MAPPINGS_NODE = "factMappings";
    public static final String SIMULATION_NODE = "simulation";
    public static final String BACKGROUND_NODE = "background";
    public static final String SIMULATION_DESCRIPTOR_NODE = "simulationDescriptor";
    public static final String SCESIM_MODEL_DESCRIPTOR_NODE = "scesimModelDescriptor";
    public static final String SCENARIO_SIMULATION_MODEL_NODE = "ScenarioSimulationModel";
    public static final String SETTINGS_NODE = "settings";
    public static final List<String> SETTINGS = Collections.unmodifiableList(Arrays.asList(DMO_SESSION_NODE, "dmnFilePath", "type", "fileName", "kieSession",
                                                                                           "kieBase", "ruleFlowGroup", "dmnNamespace", "dmnName", "skipFromBuild", "stateless"));

    private ConstantsHolder() {
        // Not instantiable
    }
}