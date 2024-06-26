/*
 * Copyright (c) 2013, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package com.sun.webkit.dom;

import org.w3c.dom.html.HTMLFormElement;
import org.w3c.dom.html.HTMLOptionElement;

public class HTMLOptionElementImpl extends HTMLElementImpl implements HTMLOptionElement {
    HTMLOptionElementImpl(long peer) {
        super(peer);
    }

    static HTMLOptionElement getImpl(long peer) {
        return (HTMLOptionElement)create(peer);
    }


// Attributes
    @Override
    public boolean getDisabled() {
        return getDisabledImpl(getPeer());
    }
    native static boolean getDisabledImpl(long peer);

    @Override
    public void setDisabled(boolean value) {
        setDisabledImpl(getPeer(), value);
    }
    native static void setDisabledImpl(long peer, boolean value);

    @Override
    public HTMLFormElement getForm() {
        return HTMLFormElementImpl.getImpl(getFormImpl(getPeer()));
    }
    native static long getFormImpl(long peer);

    @Override
    public String getLabel() {
        return getLabelImpl(getPeer());
    }
    native static String getLabelImpl(long peer);

    @Override
    public void setLabel(String value) {
        setLabelImpl(getPeer(), value);
    }
    native static void setLabelImpl(long peer, String value);

    @Override
    public boolean getDefaultSelected() {
        return getDefaultSelectedImpl(getPeer());
    }
    native static boolean getDefaultSelectedImpl(long peer);

    @Override
    public void setDefaultSelected(boolean value) {
        setDefaultSelectedImpl(getPeer(), value);
    }
    native static void setDefaultSelectedImpl(long peer, boolean value);

    @Override
    public boolean getSelected() {
        return getSelectedImpl(getPeer());
    }
    native static boolean getSelectedImpl(long peer);

    @Override
    public void setSelected(boolean value) {
        setSelectedImpl(getPeer(), value);
    }
    native static void setSelectedImpl(long peer, boolean value);

    @Override
    public String getValue() {
        return getValueImpl(getPeer());
    }
    native static String getValueImpl(long peer);

    @Override
    public void setValue(String value) {
        setValueImpl(getPeer(), value);
    }
    native static void setValueImpl(long peer, String value);

    @Override
    public String getText() {
        return getTextImpl(getPeer());
    }
    native static String getTextImpl(long peer);

    @Override
    public int getIndex() {
        return getIndexImpl(getPeer());
    }
    native static int getIndexImpl(long peer);

}

