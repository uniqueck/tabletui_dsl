/*
 * generated by Xtext
 */
package org.ckr;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TabletUIDSLUiInjectorProvider implements IInjectorProvider {
	
	@Override
	public Injector getInjector() {
		return org.ckr.ui.internal.TabletUIDSLActivator.getInstance().getInjector("org.ckr.TabletUIDSL");
	}
	
}
