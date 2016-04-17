/*
 *  Freeplane - mind map editor
 *  Copyright (C) 2008 Dimitry Polivaev
 *
 *  This file author is Dimitry Polivaev
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.freeplane.core.ui;

import java.awt.Component;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DropTargetListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.util.Set;

import javax.swing.JComponent;
import javax.swing.JPopupMenu;

import org.freeplane.core.ui.components.FreeplaneMenuBar;

public interface IUserInputListenerFactory {
	public void addMouseWheelEventHandler(final IMouseWheelEventHandler handler);

	public boolean extendSelection(MouseEvent e);

	Component getLeftToolBar();

	IMouseListener getMapMouseListener();

	MouseWheelListener getMapMouseWheelListener();

	JPopupMenu getMapPopup();

	FreeplaneMenuBar getMenuBar();

	MenuBuilder getMenuBuilder();

	public Set getMouseWheelEventHandlers();

	DragGestureListener getNodeDragListener();

	DropTargetListener getNodeDropTargetListener();

	KeyListener getNodeKeyListener();

	IMouseListener getNodeMotionListener();

	INodeMouseMotionListener getNodeMouseMotionListener();

	JPopupMenu getNodePopupMenu();

	JComponent getToolBar(String name);

	Iterable<JComponent> getToolBars();

	public void removeMouseWheelEventHandler(final IMouseWheelEventHandler handler);

	void updateMapList();
}