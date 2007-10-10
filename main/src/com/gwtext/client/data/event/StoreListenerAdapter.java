/*
 * GwtExt - Gwt Ext Integration library.
 *
 * Copyright (c) 2007, Sanjiv Jivan
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package com.gwtext.client.data.event;

import com.google.gwt.core.client.GWT;
import com.gwtext.client.data.Record;
import com.gwtext.client.data.Store;

/**
 * Store listener adapter.
 */
public class StoreListenerAdapter implements StoreListener {

    public void onAdd(Store store, Record[] records, int index) {
    }

    public boolean doBeforeLoad(Store store) {
        return true;
    }

    public void onClear(Store store) {
    }

    public void onDataChanged(Store store) {
    }

    public void onLoad(Store store, Record[] records) {
    }

    public void onRemove(Store store, Record record, int index) {
    }

    public void onUpdate(Store store, Record record, Record.Operation operation) {
    }

    //temporarily here so that users can update thier old code
    final public void onUpdate(Store store, Record record, String operation) {
    }

    public void onLoadException(Throwable error) {
        GWT.log("An error was encountered loading the store", error);
    }
}
