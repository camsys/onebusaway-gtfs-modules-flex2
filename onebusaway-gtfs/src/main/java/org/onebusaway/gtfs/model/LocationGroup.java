/**
 * Copyright (C) 2020 Kyyti Group Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.gtfs.model;

import java.util.HashSet;
import java.util.Set;

public class LocationGroup extends IdentityBean<AgencyAndId> implements Stoplike {
    private static final long serialVersionUID = 1L;

    private AgencyAndId id;

    private Set<Stoplike> locations = new HashSet<>();

    private String name;

    @Override
    public AgencyAndId getId() {
      return id;
    }

    public void setId(AgencyAndId id) {
      this.id = id;
    }

    public Set<Stoplike> getLocations() {
      return locations;
    }

    public void addLocation(Stoplike location) {
      this.locations.add(location);
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }
}
