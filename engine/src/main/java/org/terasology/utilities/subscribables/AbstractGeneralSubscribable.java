/*
 * Copyright 2016 MovingBlocks
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terasology.utilities.subscribables;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 * {@inheritDoc}
 */
public class AbstractGeneralSubscribable implements GeneralSubscribable {

    protected transient PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * {@inheritDoc}
     */
    @Override
    public void subscribe(PropertyChangeListener changeListener) {
        this.propertyChangeSupport.addPropertyChangeListener(changeListener);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void unsubscribe(PropertyChangeListener changeListener) {
        this.propertyChangeSupport.removePropertyChangeListener(changeListener);
    }

}
