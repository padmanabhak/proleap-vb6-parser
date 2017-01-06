/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.asg.metamodel;

import io.proleap.vb6.VisualBasic6Parser.TypeStmt_ElementContext;
import io.proleap.vb6.asg.metamodel.type.AssignableTypedElement;

public interface TypeElement extends ScopedElement, NamedElement, AssignableTypedElement {

	@Override
	TypeStmt_ElementContext getCtx();

	boolean isDeclaredAsArray();

	boolean isDeclaredAsStaticArray();

	void setDeclaredAsArray(boolean isDeclaredAsArray);

	void setDeclaredAsStaticArray(boolean isDeclaredAsStaticArray);
}