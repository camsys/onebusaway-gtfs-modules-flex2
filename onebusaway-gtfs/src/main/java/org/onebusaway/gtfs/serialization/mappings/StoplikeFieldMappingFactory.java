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
package org.onebusaway.gtfs.serialization.mappings;

import org.onebusaway.csv_entities.schema.EntitySchemaFactory;
import org.onebusaway.csv_entities.schema.FieldMapping;
import org.onebusaway.csv_entities.schema.FieldMappingFactory;
import org.onebusaway.gtfs.model.IdentityBean;
import org.onebusaway.gtfs.serialization.GtfsReaderContext;

/**
 * {@link FieldMappingFactory} that produces a {@link FieldMapping} instance
 * capable of mapping a CSV stoplike string entity id to an concrete entity instance, and vice
 * versa. Assumes field entity type subclasses {@link IdentityBean} and the
 * target entity can be found with
 * {@link GtfsReaderContext#getEntity(Class, java.io.Serializable)}.
 *
 * @author bdferris
 * @see IdentityBean
 * @see GtfsReaderContext#getEntity(Class, java.io.Serializable)
 */
public class StoplikeFieldMappingFactory implements FieldMappingFactory {

    public StoplikeFieldMappingFactory() {

    }

    public FieldMapping createFieldMapping(EntitySchemaFactory schemaFactory,
                                           Class<?> entityType, String csvFieldName, String objFieldName,
                                           Class<?> objFieldType, boolean required) {
        return new StoplikeFieldMappingImpl(entityType, csvFieldName, objFieldName,
                objFieldType, required);
    }
}