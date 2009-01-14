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
 

package com.gwtext.client.core;

/**
 * Callback interface used in various methods of {@link com.gwtext.client.core.UpdateManager}.
 *
 * @author Sanjiv Jivan
 * @see com.gwtext.client.core.UpdateManager#formUpdate(String, String, boolean, UrlLoadCallback)
 * @see com.gwtext.client.core.UpdateManager#update(String, UrlLoadConfig , UrlLoadCallback, boolean)
 */
public interface UrlLoadCallback {

    /**
     * The callback method.
     *
     * @param success      true if request is successful
     * @param httpStatus   the http status code
     * @param responseText thre response text
     */
    void execute(boolean success, int httpStatus, String responseText);
}