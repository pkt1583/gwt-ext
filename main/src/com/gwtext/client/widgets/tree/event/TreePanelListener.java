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

package com.gwtext.client.widgets.tree.event;

import com.gwtext.client.core.EventObject;
import com.gwtext.client.widgets.tree.TreeNode;

public interface TreePanelListener {

    boolean doBeforeChildrenRendered(TreeNode node);

    boolean doBeforeClick(TreeNode node, EventObject e);

    boolean doBeforeCollapse(TreeNode node, boolean deep, boolean anim);

    boolean doBeforeExpand(TreeNode node, boolean deep, boolean anim);

    boolean doBeforeLoad(TreeNode node);

    //todo
    //boolean doBeforeNodeDrop();

    void onCheckChange(TreeNode node, boolean checked);

    void onClick(TreeNode node, EventObject e);

    void onCollapse(TreeNode node);

    void onContextMenu(TreeNode node, EventObject e);

    void onDblClick(TreeNode node, EventObject e);

    void onDisabledChange(TreeNode node, boolean disabled);

    //todo
    //onDragDrop()
    //onEndDrag()

    void onExpand(TreeNode node);

    void onLoad(TreeNode node);

    //onNodeDragOver()

    //onNodeDrop

    //onStartDrag

    void onTextChange(TreeNode node, String text, String oldText);
}
