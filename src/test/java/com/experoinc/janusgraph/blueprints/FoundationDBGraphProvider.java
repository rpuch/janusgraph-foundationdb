// Copyright 2018 Expero Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.experoinc.janusgraph.blueprints;

import com.experoinc.janusgraph.FoundationDBContainer;
import org.janusgraph.blueprints.AbstractJanusGraphProvider;
import org.janusgraph.diskstorage.configuration.ModifiableConfiguration;

/**
 * @author Ted Wilmes (twilmes@gmail.com)
 */
public class FoundationDBGraphProvider extends AbstractJanusGraphProvider {

    private final static FoundationDBContainer container = new FoundationDBContainer();

    @Override
    public ModifiableConfiguration getJanusGraphConfiguration(String graphName, Class<?> test, String testMethodName) {
        container.start();
        if (graphName != null) return container.getFoundationDBConfiguration(graphName);
        else return container.getFoundationDBConfiguration();
    }
}
