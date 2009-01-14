/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 

package com.gwtext.client.widgets.form.event;

import com.gwtext.client.widgets.form.Field;

/**
 *
 * @author Sanjiv Jivan
 */
public interface TextFieldListener extends FieldListener {

    /**
     * Fires when the autosize function is triggered. The field may or may not have actually changed size according to
     * the default logic, but this event provides a hook for the developer to apply additional logic at runtime to
     * resize the field if needed.
     *
     * @param field this
     * @param width the new field width
     */
    void onAutoSize(Field field, int width);
}